package ex2;
import java.util.*;
public class SuperPouvoirFactory {
private HashMap<String,SuperPouvoir> cache = new HashMap<>();
public SuperPouvoir getSuperPouvoir(String nom ) {
SuperPouvoir s= cache.get(nom);
if(s== null) {
s = new SuperPouvoir(nom);
cache.put(nom, s);
return s;
}
else
	return s;
}
}
