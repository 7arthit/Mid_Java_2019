public class main {
    public Comic(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	Comic avengers = new Comic("Marvel Studios", "Avengers: Endgame");
    Comic spiderman = new Comic("Sony Picture", "Spider-Man: Far From Home");
    spiderman.addStudio("Marvel Studios");
    System.out.println(avengers.getTitle());
    System.out.printIn(avengers.getStudios());
    System.out.println(spiderman.getTitle());
    System.out.println(spiderman.getStudios());
}
