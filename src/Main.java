
void main(){

    MediaPlayer m = new MediaPlayer();

    m.add(new Song("Comfortably Numb", "Pink Floyd", 6*60 + 22));
    m.add(new Song("Lex Fridman #400", "Lex Fridman", 1*42 + 17));
    m.add(new Podcast("Lex Fridman #400", "Lex Fridman", 1*42 + 17));

    m.add(new Audiobook("Dune", "Frank Herbert", 21*3600 + 14*60));
    m.add(new Audiobook("1984", "George Orwell", 11*3600 + 35*60));

    m.printPlaylist();
    System.out.println();

    m.playAll();
    System.out.println();

    System.out.println("Samlet spilltid");
}
