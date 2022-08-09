package uz.gita.infoappMBF.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.gita.infoappMBF.R
import uz.gita.infoappMBF.databinding.ActivityDetailsBinding
import uz.gita.infoappMBF.model.FullData
import uz.gita.infoappMBF.utils.getFullList
import java.util.*

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val list: List<FullData> by lazy { getFullList(this) }
    private var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        position = intent.getIntExtra(resources.getString(R.string.position), 0)

        setSupportActionBar(binding.toolbar)
        Objects.requireNonNull(supportActionBar)!!.setDisplayHomeAsUpEnabled(true)

        with(binding) {
            collapsingToolbarLayout.title = list[position].title
            collapsingImageView.setImageResource(list[position].photo_main)
            tvDescription.text = list[position].description
            secondaryPhoto.setImageResource(list[position].photo_secondary)
            tvIngredients.text = list[position].ingredients
            tvMethods.text = list[position].methods
        }
    }
}