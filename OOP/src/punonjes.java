/**
 * Klasa punonjes modelon nje punonjes te nje kompanie 
 * @author Albina
 * @version 1.0
 * 
 */
public class punonjes{
	private String emri;//Emri i punonjesit 
	private String mbiemri;//Mbiemri i punonjesit 
	private double pagaMujore;//Paga mujore te punonjesit 
	private boolean paga13 = false;//paga 13 e punonjesit 
	private  static int nrpunonjes = 0; 
	public punonjes() {
		nrpunonjes++;
		
	}
	/**
	 *  Nderton nje objekt te klases punonjes me parametra te specifikuar me poshte
	 * 
	 * @param emri Emri i punonjesit 
	 * @param mbiemri Mbiemri i punonjesit 
	 * @param pagaMujore Paga mujore e punonjesit 
	 */
	public punonjes(String emri, String mbiemri, double pagaMujore) {
	setEmri(emri);	
	setMbiemri(mbiemri);
	if (pagaMujore > 0.0) setPagaMujore(pagaMujore); 
		nrpunonjes++;
	}
	/**
	 * Metoda get per emrin e punonjesit 
	 * @return emri i punonjesit 
	 */
	public String getEmri() {return emri;}
	/**
	 * Metoda set per fushen emri 
	 * @param emri Vendos emrin e punonjesit 
	 */
	public void setEmri(String emri) {this.emri = emri;}
	public String getMbiemri() {return mbiemri;}
	public void setMbiemri(String mbiemri) {this.mbiemri = mbiemri;}
	public double getPagaMujore() {return pagaMujore;}
	public void setPagaMujore(double pagaMujore) {this.pagaMujore = pagaMujore;}
	public boolean getPaga13() {return paga13;}
	public void setPaga13(boolean paga13) {this.paga13 = paga13;}
	/*
	 * @return 12 pagat plus pagen e 13 nese fusha paga13 eshte true
	 * 
	 */
	public double getPagaVjetore() {
		
		return getPaga13()?getPagaMujore()*13:getPagaMujore()*12;
	}
	public static int getNrpunonjes() {
		return nrpunonjes;
	}
	public static void setNrpunonjes(int nrpunonjes) {
		punonjes.nrpunonjes = nrpunonjes;
	}
	public static void afishopunonjes(punonjes punonjes) {
		if(punonjes!=null)System.out.printf("%-9s%-13s%11.2f\n",
				punonjes.getEmri(),
				punonjes.getMbiemri(),
				punonjes.getPagaMujore()
				);
		
	}
}