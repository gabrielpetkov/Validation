
import java.util.regex.Pattern;

public class Client {
    private String name;
    private String egn;
    private String eik;
    private String email;
    private String facilityKey;
    
    public String getName(){
        return name;
    }
    
    public void setName(String enterName){
        if (validateName(enterName) != true){
            return;
        }        
        this.name = enterName;
    }
    
    public String getEgn(){
        return egn;
    }
    
    public void setEgn(String enterEgn){
        if (validateEgn(enterEgn) != true){
            return;
        }
        this.egn = enterEgn;
    }
    
    public String getEik(){
        return eik;
    }
    
    public void setEik(String enterEik){
        if (validateEik(enterEik) != true){
            return;
        }
        this.eik = enterEik;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String enterEmail){
        if (validateEmail(enterEmail) != true){
            return;
        }
        this.email = enterEmail;
    }
    
    public String getFacilityKey(){
        return facilityKey;
    }
    
    public void setFacilityKey(String enterFacilityKey){
        if (validateFacilityKey(enterFacilityKey) != true){
            return;
        }
        this.facilityKey = enterFacilityKey;
    }
    
   public boolean validateName(String name){
       String NAME_patern = "[A-Za-z -]{1,50}";
       return Pattern.compile(NAME_patern).matcher(name).matches();
   }
   
   private boolean validateEgn(String egn){
       String EGN_patern = "[0-9]{10}";
       return Pattern.compile(EGN_patern).matcher(egn).matches();
   } 
       
   private boolean validateEik(String eik){
       String EIK_patern = "[0-9]{9}";
       return Pattern.compile(EIK_patern).matcher(eik).matches();
   }
   
   private boolean validateEmail(String email){
       String EMAIL_patern = "[a-zA-Z0-9_.]{3,30}@[a-zA-Z0-9-_.]{1,63}";
       return Pattern.compile(EMAIL_patern).matcher(email).matches();
   } 
    
   private boolean validateFacilityKey(String facilityKey){
       String FACILITYKEY_patern = "[0-9]{2}-[0-9]{3}";
       return Pattern.compile(FACILITYKEY_patern).matcher(facilityKey).matches();
   } 
  
}
