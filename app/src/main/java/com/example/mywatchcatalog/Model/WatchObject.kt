package com.example.mywatchcatalog.Model

import com.example.mywatchcatalog.Catalog

object WatchObject {
    private var data = arrayOf(
        arrayOf(
            "Christyan Arden Original Leather CA4124 Black - White Dial (Wanita)",
            "119.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584506247_9a40584063_k.jpg",
            "Case Diameter : 30 mm\n" +
            "Case Thickness : 10 mm\n" +
            "Case Material : Stainless Steel\n" +
            "Mineral Crystal Glass\n" +
            "Water Resistant\n" +
            "Japan Design\n" +
            "Function : Hour, Minutes, Second"
        ),
        arrayOf(
            "Christyan Arden Original Leather CA4115 Black - Black Dial (Pria)",
            "129.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584583552_93119c37e1_k.jpg",
            "Case Diameter : 30 mm\n" +
            "Case Thickness : 10 mm\n" +
            "Case Material : Stainless Steel\n" +
            "Mineral Crystal Glass\n" +
            "Water Resistant\n" +
            "Japan Design\n" +
            "Function : Hour, Minutes, Second"
        ),
        arrayOf(
            "Christyan Arden Original Leather CA0013 Brown - White Dial (Pria)",
            "139.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584437371_9d5751e919_k.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),
        arrayOf(
            "Christyan Arden Luxury Watch CA4052 Black Dial (Wanita)",
            "109.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584583262_7319ad0bc7_k.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),
        arrayOf(
            "Christyan Arden Original Leather CA4082 Brown - Black Dial (Pria)",
            "159.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584583162_295ee6ad04_k.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),arrayOf(
            "Christyan Arden Luxury Collection CA001A Black Dial (wanita)",
            "219.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584582957_b3455eefae_z.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),arrayOf(
            "Christyan Arden Luxury Watch CA4052 White Dial (Wanita)",
            "169.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584582807_263460dbe0_z.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),arrayOf(
            "Christyan Arden Luxury Watch LH CA3600 Black Dial (Wanita)",
            "199.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584582702_598a541587_z.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),arrayOf(
            "Christyan Arden Original Leather CA0014 Black - White Dial (Wanita)",
            "129.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584582027_cf2d3c9474_z.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        ),arrayOf(
            "Christyan Arden Luxury Watch GH CA3593 Black Dial (Pria)",
            "229.000,00",
            "Harga sudah termasuk pajak, Ongkir dihitung di checkout",
            "https://live.staticflickr.com/65535/48584581857_1a782d3bbf.jpg",
            "Case Diameter : 30 mm\n" +
                    "Case Thickness : 10 mm\n" +
                    "Case Material : Stainless Steel\n" +
                    "Mineral Crystal Glass\n" +
                    "Water Resistant\n" +
                    "Japan Design\n" +
                    "Function : Hour, Minutes, Second"
        )
    )

    val listData: ArrayList<Catalog>
        get() {
            val list = ArrayList<Catalog>()
            for (aData in data) {
                val watch = Catalog()
                watch.name = aData[0] as String
                watch.price = aData[1] as String
                watch.desc = aData[2] as String
                watch.image = aData[3] as String
                watch.specs = aData[4] as String

                list.add(watch)
            }

            return list
        }
}