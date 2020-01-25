package encapsulation;

public class main {
    public static void main(String[] args) {
//        player player=new player();
//
//        player.name="Mahade";
//        player.health=20;
//        player.weapon="Gun";
//
//        //int damage=10;
//       // player.loseHealth(damage);
//       // System.out.println("Remaining Health = " +player.healthRemaining());
//
//
//        int damage=20;
//        player.health=5;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " +player.healthRemaining());

        enhancedPlayer newEnhancedPlayer =new enhancedPlayer("Mahade",50,"Sword");
        System.out.println("The initial health is " + newEnhancedPlayer.getHealth());
//
//
//
    }
}
