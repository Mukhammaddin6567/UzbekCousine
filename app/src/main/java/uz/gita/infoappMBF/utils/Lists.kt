package uz.gita.infoappMBF.utils

import android.content.Context
import uz.gita.infoappMBF.R
import uz.gita.infoappMBF.model.FullData
import uz.gita.infoappMBF.model.ItemData

fun getItemList(context: Context): List<ItemData> {
    val list = mutableListOf<ItemData>()

    list.add(
        ItemData(
            id = 1,
            title = context.resources.getString(R.string.title1),
            description = context.resources.getString(R.string.description1),
            photo = R.drawable.photo1
        )
    )

    list.add(
        ItemData(
            id = 2,
            title = context.resources.getString(R.string.title2),
            description = context.resources.getString(R.string.description2),
            photo = R.drawable.item_photo2
        )
    )

    list.add(
        ItemData(
            id = 3,
            title = context.resources.getString(R.string.title3),
            description = context.resources.getString(R.string.description3),
            photo = R.drawable.item_photo3
        )
    )

    list.add(
        ItemData(
            id = 4,
            title = context.resources.getString(R.string.title4),
            description = context.resources.getString(R.string.description4),
            photo = R.drawable.item_photo4
        )
    )

    list.add(
        ItemData(
            id = 5,
            title = context.resources.getString(R.string.title5),
            description = context.resources.getString(R.string.description5),
            photo = R.drawable.item_photo5
        )
    )

    list.add(
        ItemData(
            id = 6,
            title = context.resources.getString(R.string.title6),
            description = context.resources.getString(R.string.description6),
            photo = R.drawable.item_photo6
        )
    )

    list.add(
        ItemData(
            id = 7,
            title = context.resources.getString(R.string.title7),
            description = context.resources.getString(R.string.description7),
            photo = R.drawable.item_photo7
        )
    )

    list.add(
        ItemData(
            id = 8,
            title = context.resources.getString(R.string.title8),
            description = context.resources.getString(R.string.description8),
            photo = R.drawable.item_photo8
        )
    )

    list.add(
        ItemData(
            id = 9,
            title = context.resources.getString(R.string.title9),
            description = context.resources.getString(R.string.description9),
            photo = R.drawable.item_photo9
        )
    )

    return list
}

fun getFullList(context: Context): List<FullData> {
    val list = mutableListOf<FullData>()

    list.add(
        FullData(
            id = 1,
            title = context.resources.getString(R.string.title1),
            description = "\t" + context.resources.getString(R.string.description1) + "\n\n" + context.resources.getString(
                R.string.fullDescription1
            ),
            ingredients = context.resources.getString(R.string.ingredients1),
            methods = context.resources.getString(R.string.methods1),
            photo_main = R.drawable.photo1,
            photo_secondary = R.drawable.item_photo1
        )
    )

    list.add(
        FullData(
            id = 2,
            title = context.resources.getString(R.string.title2),
            description = "\t" + context.resources.getString(R.string.description2) + "\n\n" + context.resources.getString(
                R.string.fullDescription2
            ),
            ingredients = context.resources.getString(R.string.ingredients2),
            methods = context.resources.getString(R.string.methods2),
            photo_main = R.drawable.photo2,
            photo_secondary = R.drawable.item_photo2
        )
    )

    list.add(
        FullData(
            id = 3,
            title = context.resources.getString(R.string.title3),
            description = "\t" + context.resources.getString(R.string.description3) + "\n\n" + context.resources.getString(
                R.string.fullDescription3
            ),
            ingredients = context.resources.getString(R.string.ingredients3),
            methods = context.resources.getString(R.string.methods3),
            photo_main = R.drawable.photo3,
            photo_secondary = R.drawable.item_photo3
        )
    )

    list.add(
        FullData(
            id = 4,
            title = context.resources.getString(R.string.title4),
            description = "\t" + context.resources.getString(R.string.description4) + "\n\n" + context.resources.getString(
                R.string.fullDescription4
            ),
            ingredients = context.resources.getString(R.string.ingredients4),
            methods = context.resources.getString(R.string.methods4),
            photo_main = R.drawable.photo4,
            photo_secondary = R.drawable.item_photo4
        )
    )

    list.add(
        FullData(
            id = 5,
            title = context.resources.getString(R.string.title5),
            description = "\t" + context.resources.getString(R.string.description5) + "\n\n" + context.resources.getString(
                R.string.fullDescription5
            ),
            ingredients = context.resources.getString(R.string.ingredients5),
            methods = context.resources.getString(R.string.methods5),
            photo_main = R.drawable.photo5,
            photo_secondary = R.drawable.item_photo5
        )
    )

    list.add(
        FullData(
            id = 6,
            title = context.resources.getString(R.string.title6),
            description = "\t" + context.resources.getString(R.string.description6) + "\n\n" + context.resources.getString(
                R.string.fullDescription6
            ),
            ingredients = context.resources.getString(R.string.ingredients6),
            methods = context.resources.getString(R.string.methods6),
            photo_main = R.drawable.photo6,
            photo_secondary = R.drawable.item_photo6
        )
    )

    list.add(
        FullData(
            id = 7,
            title = context.resources.getString(R.string.title7),
            description = "\t" + context.resources.getString(R.string.description7) + "\n\n" + context.resources.getString(
                R.string.fullDescription7
            ),
            ingredients = context.resources.getString(R.string.ingredients7),
            methods = context.resources.getString(R.string.methods7),
            photo_main = R.drawable.photo7,
            photo_secondary = R.drawable.item_photo7
        )
    )

    list.add(
        FullData(
            id = 8,
            title = context.resources.getString(R.string.title8),
            description = "\t" + context.resources.getString(R.string.description8) + "\n\n" + context.resources.getString(
                R.string.fullDescription8
            ),
            ingredients = context.resources.getString(R.string.ingredients8),
            methods = context.resources.getString(R.string.methods8),
            photo_main = R.drawable.photo8,
            photo_secondary = R.drawable.item_photo8
        )
    )

    list.add(
        FullData(
            id = 9,
            title = context.resources.getString(R.string.title9),
            description = "\t" + context.resources.getString(R.string.description1) + "\n\n" + context.resources.getString(
                R.string.fullDescription9
            ),
            ingredients = context.resources.getString(R.string.ingredients9),
            methods = context.resources.getString(R.string.methods9),
            photo_main = R.drawable.photo9,
            photo_secondary = R.drawable.item_photo9
        )
    )

    return list
}