import java.util.Scanner;

class SearchAnime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String anime[] = {"Naruto", "Bleach", "One Piece", "Dragon Ball", 
        "Death Note", "Full Metal Alchemist", "Hunter x Hunter", "Fairy Tail", 
        "Sword Art Online", "Attack on Titan"};

        System.out.print("Masukkan nama anime yang ingin dicari: ");
        String name = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < anime.length; i++) {
            if (name.equalsIgnoreCase(anime[i])) {
                System.out.println("Anime " + name + " ditemukan pada indeks ke-" + i);
                found = true;
                break;
            }else{
                found = false;
            }
        }

        if (!found) {
            System.out.println("Anime " + name + " tidak ditemukan");
        }

        sc.close();
    }
}