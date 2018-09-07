public class DanliDemo {
    public static void main(String[] args) {
        Danli d1 = Danli.GetDanli();
        

    }
    }
    class Danli{
        private Danli() {};
        private static Danli danli = new Danli();
        public static Danli GetDanli(){
            return danli;
        }
    }

