package i_introduction._2_Named_Arguments

fun task2(collection: Collection<Int>): String =
  collection.joinToString(prefix = "{", postfix = "}")
