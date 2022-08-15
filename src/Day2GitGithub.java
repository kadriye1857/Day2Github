public class Day2GitGithub {
    /*
    1-git init --> Local repo olusturmak icin yani  .git ile klasorumuzun
    icindeki dosyalari iliskilendirmek icin kullanilir
    2-git add . --> Working spece'dan (yani yerel)dosyalarimi staking are'ya
    (yani commitlemek icin beklenen yer)gönderir
    3-git status --> Working space'deki ve staging area'daki durumu gosterir
    4-git commit -m "mesaj" --> Staking area'dan commit stora dosyalarımı göndermek
    için kullanılır
    4- git push --> Uzak repo'ya (yani remote -Github)göndermek için
    kullandığımız kod yalnız git push komutunu direk kullanmak istersek 1
    kereye mahsus
    git remote add origin -adres
    git push -u origin master
    Not :Bu iki komutu tek seferde kullandıktan sonra ikinci commit'lerin
    için sadece git push kullanırız.

     */
    public static void main(String[] args) {
        System.out.println("Branch deneme 1");
        System.out.println("Master deneme2");
    }
}
