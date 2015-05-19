public class TestMahasiswa{
	public static void main (String[] args)
	{
		Mahasiswa mhs = new Mahasiswa("Yoga Setya Putra", 20);
		mhs.TampilBiodata();

		System.out.println();
		
		mhs.setUmur(25);
		mhs.TampilBiodata();
	}
}