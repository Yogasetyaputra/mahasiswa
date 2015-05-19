public class Mahasiswa
{
	private String Nama;
	private int Umur;

	public Mahasiswa(String nm, int umr)
	{
		Nama = nm;
		Umur = umr;
	}

	public void setNama(String nm)
	{
		Nama = nm;
	}
	public String getNama()
	{
		return Nama;
	}

	public void setUmur(int umr)
	{
		Umur = umr;
	}
	public int getUmur()
	{
		return Umur;
	}
	

	
	public void TampilBiodata()
	{
		System.out.println("== BIODATA ==");
		System.out.println("nama : " +Nama);
		System.out.println("umur : " +Umur);
	}
}