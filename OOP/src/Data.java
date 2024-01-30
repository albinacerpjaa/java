/**
 * Klasa Data perdoret per te moderuar nje date te vitit
 * @author Albina
 * @version 1.0
 * 
 */
public class Data {
private int dita;
private int muaji;
private int viti;
/*
 * konstruktori pa parametra qe nderton nje objekt nje date default
 * 1/1/1970
 * Muajt me 31 jane; Janar, Mars, Maj, Korrik, Gusht, Tetor, Dhjetor
 * Muajt me 30 jane; prill, Qershor, Shtator, Nentot
 * Muajt me 28 ose 29; shkurti.
 * Viti quhet i brishte nese numri qe perfaqeson ai plotpjestohet 
 * me 4 por jo me 100 ose plotpjestohet me 400.Shkurti i vitit te brishte ka 29 dite. 
 */
public  Data() {
	this.dita = 1;
	this.muaji = 1;
	this.viti = 1970;
}
public Data(int dita, int muaji, int viti) {
	
	if(kontrolloData(dita, muaji, viti)) {
	setDita(dita);
	setMuaji(muaji);
	setViti(viti);
	}
	else {
		setDita(1);
		setMuaji(1);
		setViti(1970);
	}
}

private boolean kontrolloData(int dita, int muaji, int viti) {
	if(dita <=0 || dita>31 || muaji<=0 || muaji > 12|| viti<=0) return false;
	if((muaji==4 || muaji == 6 || muaji==9 || muaji==11)&& dita>30) return false;
	if(muaji==2 && dita> 29)return false;
	if(!vitiBrishte(viti)&& muaji== 2 && dita>28 )return false;
	return true;
}
/**
 * Viti quhet i brishte kur numri i vitit plotpjestohet me 4 por jo me 100 ose plotpjestohet me 400
 * @param viti perfaqeson vitin 
 * @return true nese viti eshte i brishte, false perndryshe 
 */
private boolean vitiBrishte(int viti) {
	if(viti%4==0  && viti%100!=0 || viti % 400 ==0)return true;
	else return true;
}
/**
 * 
 * @return dita variabli i instances dita
 */
public int getDita() {
	return dita;
}
public void setDita(int dita) {
	if(kontrolloData(dita, this.muaji, this.viti))
	this.dita = dita;
}
public int getMuaji() {
	return muaji;
}
public void setMuaji(int muaji) {
	if(kontrolloData(this.dita, muaji, this.viti))
	this.muaji = muaji;
}
public int getViti() {
	return viti;
}
public void setViti(int viti) {
	if(kontrolloDaten(this.dita, this.muaji, viti))
	this.viti = viti;
}
/**
 * Afisho daten ne formatit dd/mm/yyyy
 */
public void afishoDaten() {
	String dita;
	String muaji;
	String data;
	if(getDita() < 10) dita = "0" + getDita();
	else 
		dita ="" + getDita();
	if(getMuaji() < 10) muaji = "0" +getMuaji();
	else 
		muaji ="" + getMuaji();
	data = dita + "/" + muaji + "/" + getViti();
	System.out.println(data);
} 
}
