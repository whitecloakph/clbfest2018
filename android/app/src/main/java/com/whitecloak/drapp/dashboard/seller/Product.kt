package com.whitecloak.drapp.dashboard.seller

/**
 * Created by kimnicolemontano on 2018/03/18.
 */
class Product{
    var imagePath : String
    var name : String
    var description : String
    var price : String

    constructor(productImagePath: String, productName: String, productDescription: String, productPrice: String){
        imagePath = productImagePath
        name = productName
        description = productDescription
        price = productPrice
    }
}