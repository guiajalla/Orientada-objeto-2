package app;

import app.test.Identifier;

public class IdentifierMain {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("Uso: IdentifierMain <string>");
      } else {
          Identifier id = new Identifier();
          if (Identifier.validateIdentifier(args[0])) {
             System.out.print("Valido");
          } else {
              System.out.print("Invalido");
          }
      }
   }
}
