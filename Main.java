class Main {
  public static void main(String[] args) {
    
    // ask user for the words and store as message
String name = Keyboard.getText("Please enter your name");
    // store the number of the letters as numberLetters
  int nameLength = name.length();  
    // display "There are " + numberLetters + " in " + message
Screen.display("There are " + nameLength + " characters in the name: " + name, "Name Character Counter");
  }
}
