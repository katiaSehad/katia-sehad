
package roman;
import java.util.Iterato
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;

public final class RomanNumber extends Number {

  public static final long serialVersionUID = 1L;

  // Table des symboles
  private static final LinkedHashMap<String, Integer> SYMBOLS = new LinkedHashMap<>();
  static {
    SYMBOLS.put("M",  1000);
    SYMBOLS.put("CM", 900);
    SYMBOLS.put("D",  500);
    SYMBOLS.put("CD", 400);
    SYMBOLS.put("C",  100);
    SYMBOLS.put("XC", 90);
    SYMBOLS.put("L",  50);
    SYMBOLS.put("XL", 40);
    SYMBOLS.put("X",  10);
    SYMBOLS.put("IX", 9);
    SYMBOLS.put("V",  5);
    SYMBOLS.put("IV", 4);
    SYMBOLS.put("I", 1);
  }

  // Expression reguliere de validation
  private static final Pattern VALIDATION_RE = Pattern.compile(
      "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

  private final int value;

  public RomanNumber(String romanValue) {
    this.value = fromRoman(romanValue);
  }

  public RomanNumber(int value) {
    this.value = value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public double doubleValue() {
    this.value =(double)this.value;
    return   this.value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public float floatValue() {

    return (float)this.value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public int intValue() {
    return this.value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public long longValue() {
    // TO
    return (long)this.value;
  }

  @Override
  public String toString() {
    return toRoman(this.value);
  }

  public static RomanNumber valueOf(String roman) {
    return new RomanNumber(roman);
  }

  public static RomanNumber valueOf(int value) {
    return new RomanNumber(value);
  }

	private static int fromRoman(String romanValue) {
	// TODO
	  int resultat=0;
	  int index=0;

		Set st = SYMBOLS.entrySet(); 
		Iterator itr = st.iterator();
        
        
        if(romanValue.equals(romanValue.toUpperCase()))
        {
           System.out.println("La chaîne est en majuscule");
        }
        else{
            throw new IllegalArgumentException("value doit etre en majuscule");
        }
        
        
		while(itr.hasNext())
		{

			//System.out.println(itr.next());
			Map.Entry mapentry = (Map.Entry) itr.next();
		  System.out.println("clé: "+mapentry.getKey()
							+ " | valeur: " + mapentry.getValue());

			while (romanValue.charAt(index)==mapentry.getkey())
			{
				resultat=resultat+ mapentry.getValue();
				index=index+(mapentry.getkey()).lentgh();
			}
		} 
		return resultat	;
 


	}


  

	private static String toRoman(int value) {
	// TODO
		

		String resultat="";
		
		Set st = SYMBOLS.entrySet(); 
		Iterator itr = st.iterator();
		if (value<=0 )|| (value>=4000)
		{
			 throw new IllegalArgumentException("value doit etre superieure a 0 et inf a 4000");
		}
		while(itr.hasNext())
		{
			Map.Entry mapentry = (Map.Entry) itr.next();
			System.out.println("clé: "+mapentry.getKey()
							+ " | valeur: " + mapentry.getValue());

			while (value >= mapentry.getValue())
			{
				resultat=resultat+ mapentry.getkey();
				value=value-mapentry.getValue();
			}
			
		} 
		return resultat	;

  }
}
