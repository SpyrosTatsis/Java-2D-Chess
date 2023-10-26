public class Main {

    public static void main(String[] args) {
        System.out.println("===Start_of_Main ====");
        GFXEngine gfx = new GFXEngine();
        gfx.init();
        GameEngine game = new GameEngine();
        game.init();
    }

}