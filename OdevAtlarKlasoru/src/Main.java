import java.io.File;

public class Main {

	public static void main(String[] args) {

		File path = new File("C:\\Users\\nseme\\OneDrive\\Masaüstü\\atlar");

		if (!path.exists()) {
			System.out.println("Masaüstünde 'atlar' klasörü bulunamadı.");
			return;
		}

		File[] altKlasorler = path.listFiles(File::isDirectory);

		if (altKlasorler != null) {
			for (File klasor : altKlasorler) {
				System.out.println("Klasör: " + klasor.getName());

				File[] dosyalar = klasor.listFiles();
				if (dosyalar != null) {
					for (File dosya : dosyalar) {
						System.out.println("-Dosya: " + dosya.getName());
					}
				} else {
					System.out.println("Klasör boş.");
				}
				System.out.println();
			}
		} else {
			System.out.println("Alt klasörler bulunamadı.");
		}
	}
}