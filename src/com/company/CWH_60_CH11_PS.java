abstract class Pen{
     abstract public void write();
     abstract public void refill();
}
class fountainPen extends Pen{
     public void write(){
          System.out.println("Writting...");
     } 
     public void refill(){
         System.out.println("Refilling...");
     }
     public void changeNib(){
        System.out.println("Changing Nib...");
     }
}
class Monkey{
    public void jump(){
        System.out.println("jumping.."); 
    }
    public void bite(){
        System.out.println("Bitting...");
    }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
     @Override 
     public void eat(){
         System.out.println("Eating..."); 
     }
     @Override
     public void sleep(){
        System.out.println("Sleeping...");
     }
     public void brush(){
        System.out.println("Brushing Teeths...");
     }
     public void playingGames(){
        System.out.println("Playing Games...");
     }
}
abstract class TelePhone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
} 
class SmartPhone1 extends TelePhone{
    public void ring(){
        System.out.println("Ringing Mobile...");
    }
    public void lift(){
        System.out.println("lifting Mobile...");
    }
    public void disconnect(){
        System.out.println("disconnect call...");
    }
    public void playingGame(){
        System.out.println("Playing game..");
    }
    public void listeningSong(){
        System.out.println("Listening Song...");
    }
}
interface SmartTvRemote{
     public void channelNext();
     public void channelPrevious();
     public void blinkingLight();
}
interface TvRemote extends SmartTvRemote{
    public void volumeUp();
    public void volumeDown();
}
class Tv implements TvRemote{
    public void channelNext(){
        System.out.println("Next Channel...");
    }
    public void channelPrevious(){
         System.out.println("Previous Channel...");
    }
    public void blinkingLight(){
        System.out.println("Light is Blinking....");
    }
    public void volumeUp(){
        System.out.println("Volume Increase...");
    }
    public void volumeDown(){
        System.out.println("Volume Decrease...");
    }
    public void turnOnTv(){
        System.out.println("Tv Turning On...");
    }
}
public class CWH_60_CH11_PS{
    public static void main(String[] args) {
        // 1) 2)
        // fountainPen fp=new fountainPen();
        // fp.write();
        // fp.refill();
        // fp.changeNib();

        // 3)
        // Human h=new Human();
        // h.jump();
        // h.bite();
        // h.eat();
        // h.sleep();

        // 4)
        // TelePhone tel=new SmartPhone1();
        // tel.ring();
        // tel.lift();
        // tel.disconnect();
        // SmartPhone1 sm=new SmartPhone1();
        // sm.ring();
        // sm.lift();
        // sm.disconnect();
        // sm.playingGame();
        // sm.listeningSong();

        // 5)
        Monkey m1=new Human();
        m1.jump();
        m1.bite();
        BasicAnimal b1=new Human();
        b1.eat();
        b1.sleep();
        Human h1=new Human();
        h1.jump();
        h1.bite();
        h1.eat();
        h1.sleep();
        h1.brush();
        h1.playingGames();

        // 6) 7)
        // SmartTvRemote sm1=new Tv();
        // sm1.channelPrevious();
        // sm1.channelNext();
        // sm1.blinkingLight();
        // TvRemote tm=new Tv();
        // tm.channelPrevious();
        // tm.channelNext();
        // tm.blinkingLight();
        // tm.volumeUp();
        // tm.volumeDown();
        // Tv t1=new Tv();
        // t1.channelPrevious();
        // t1.channelNext();
        // t1.blinkingLight();
        // t1.volumeUp();
        // t1.volumeDown();
        // t1.turnOnTv();
    }
}