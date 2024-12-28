
import java.util.*;

public class IdandPassword {
    HashMap<String,String> loginInfo = new HashMap<>();
    IdandPassword()
    {
            loginInfo.put("Anik", "CSE");
            loginInfo.put("sami", "cse123");
    }

   protected HashMap getLogiInfo()
   {
    return loginInfo;
   }

}
