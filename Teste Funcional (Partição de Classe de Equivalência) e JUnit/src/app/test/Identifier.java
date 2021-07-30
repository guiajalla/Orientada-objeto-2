package app.test;

import org.junit.Assert;
import org.junit.Test;

public class Identifier {
   public static boolean validateIdentifier(String s) {
      char achar;
      boolean valid_id = false;
      if (s.length() > 0) {
         achar = s.charAt(0);
         valid_id = valid_s(achar);
         if (s.length() > 1) {
            achar = s.charAt(1); 
	    int i = 1;
            while (i < s.length()) {
               achar = s.charAt(i);
               if (!valid_f(achar))
                  valid_id = false;
               i++;
            }
         }
      }
      if (valid_id && (s.length() >= 1) && (s.length() <= 6))
         return true;
      else
         return false;
   }

   public static boolean valid_s(char ch) {
      if (((ch >= 'A') && (ch <='Z')) || ((ch >= 'a') && (ch <= 'z')))
         return true;
      else
         return false;
   }
   
   public static boolean valid_f(char ch) {
      if (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')) || ((ch >= '0') && (ch <= '9')))
         return true;
      else
         return false;
   }
   public class IdentifierTest {

		@Test
		public void testvalidateIdentifier() {
			boolean s;
			
			s = Identifier.validateIdentifier("a5");
			Assert.assertTrue(s);

	        s = Identifier.validateIdentifier("");
	        Assert.assertFalse(s);

	        s = Identifier.validateIdentifier("665432197");
	        Assert.assertFalse(s);

	        s = Identifier.validateIdentifier("B*ss1");
	        Assert.assertFalse(s);

			
			
		}
	}
}