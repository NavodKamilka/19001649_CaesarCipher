object CeasarCipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  print("Input Text : ")
  val Plaintext = scala.io.StdIn.readLine()
  print("Shift Value : ")
  val shift = scala.io.StdIn.readInt()

  val outputTextEncrypt = Plaintext.map( (c: Char) => {
    val x = alphabet.indexOf(c.toUpper)
    if (x == -1){
      c
    }
    else{
      alphabet((x + shift) % alphabet.size)
    }
  });

  val outputTextDecrypt = outputTextEncrypt.map( (c: Char) => {
    val x = alphabet.indexOf(c.toUpper)
    if (x == -1){
      c
    }
    else{
      alphabet((x - shift) % alphabet.size)
    }
  });

  println("Encrypt Text :"+outputTextEncrypt);
  println("Decrypt Text :"+outputTextDecrypt);

}