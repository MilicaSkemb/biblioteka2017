package biblioteka.interfejs;
import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;
public interface BibliotekaIntefejs {
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long isbn, int izdanje, Autor autori);
}
