object MyScalaDataTypes  {

  def main(args: Array[String]): Unit = {

    //Scala Byte    Size: 8-bit  Signed value   Range: -128 to 127
    //Scala Short   Size: 16-bit Signed value   Range: -32768 to 32767
    //Scala Int     Size: 32-bit Signed value   Range: – 2147483648 to 2147483647
    //Scala Long    Size: 64-bit Signed value   Range: -9223372036854775808 to 9223372036854775807

    //Scala Float   Size: 32-bit It follows the IEEE 754 standard, and is a single-precision float.
    //Scala Double  Size: 32-bit It follows the IEEE 754 standard, and is a double-precision float.

    //Scala Char    Size: 16-bit It is an unsigned Unicode character  Range: U+0000 to U+FFFF
    //Scala String  A string is a sequence of Chars.

    //Scala Boolean A Boolean value is either true or false.

    //Scala Unit    There is only one instance of unit, and that is (). It carries no meaningful information. And since all functions must return something, sometimes, we have them return Unit.

    //Scala Null    This refers to an empty or null reference. It is a subtype of all reference types. This makes it a subtype of any subtype of AnyRef. Null helps with interoperability with other JVM languages, and we almost never use it.

    /*Scala Nothing Nothing is a subtype to every other type. And trust us, it holds no value at all.
      Since it is a subtype of all types, we also call it the bottom type. Actually, no value is of type Nothing. So where would we use it? We can use it to signal non-termination like a thrown exception, program exit, or an infinite loop.*/

    //Scala Any     This is the supertype for all other types. This means that any object is of the type Any.

    //Scala AnyVal  This represents value types.

    //Scala AnyRef  AnyRef represents reference types.

    //Since all these Scala Data types are objects and not primitives, it is possible to call methods on these objects.

    val myByte : Byte = 127
    val myShort : Short = 25641
    val myInt : Int = 564859
    val myLong : Long = 457894785L

    val myBoolean : Boolean = true
    val myFloat : Float = 4514124.787f
    val myDouble : Double = 75748454875274.0












  }

}


