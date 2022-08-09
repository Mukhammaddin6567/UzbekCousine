package uz.gita.infoappMBF.ui

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import uz.gita.infoappMBF.ItemClickListener
import uz.gita.infoappMBF.R
import uz.gita.infoappMBF.adapter.Adapter
import uz.gita.infoappMBF.databinding.ActivityMainBinding
import uz.gita.infoappMBF.databinding.DialogAboutBinding
import uz.gita.infoappMBF.utils.getItemList

class MainActivity : AppCompatActivity(), ItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private val adapter: Adapter by lazy { Adapter(this) }
    private var timePressed: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter.submitList(getItemList(this))

        with(binding) {
            recyclerView.layoutManager = LinearLayoutManager(applicationContext)
            recyclerView.adapter = adapter
            binding.about.setOnClickListener {
                showDialog()
            }
        }

    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(getString(R.string.position), position)
        startActivity(intent)
    }

    private fun showDialog() {
        val dialogBinding = DialogAboutBinding.inflate(layoutInflater)
        val dialog = Dialog(this)
        dialog.setContentView(dialogBinding.root)
        dialog.setCancelable(false)
        dialogBinding.dialogButton.setOnClickListener {
            dialog.dismiss()
        }
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

    override fun onBackPressed() {
        if (timePressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        } else {
            Snackbar.make(binding.root, "Click again to exit", Snackbar.LENGTH_SHORT)
                .setBackgroundTint(ContextCompat.getColor(this, R.color.color_toolbar))
                .show()
        }
        timePressed = System.currentTimeMillis()
    }
}