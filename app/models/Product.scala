package models

case class Product(
	ean: Long, name: String, description: String)

object Product {
	var products = Set(
		Product(5010255079763L, "Paperclips Large",
			"Large Plain Pack of 1000"),
		Product(5010255079766L, "YPaperclips Large",
			"Large Plain Pack of 1000"),
		Product(5010255079776L, "XPaperclips Large",
			"Large Plain Pack of 1000"),
		Product(5010255079900L, "ZPaperclips Large",
			"Large Plain Pack of 1001"),
		Product(5010255079790L, "APaperclips Large",
			"Large Plain Pack of 1000")
	)

    def findAll = products.toList.sortBy(_.ean)

    def findByEan(ean: Long) = products.find(_.ean == ean)
}