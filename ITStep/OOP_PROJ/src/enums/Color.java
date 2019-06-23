package enums;

class Person{
    String name;
}

class Colors{
    public final static String GREEN_CODE = "#008000";
    public final static String RED_CODE = "#FF0000";
    public final static String BLACK_CODE = "#000000";
}

public enum Color {
    RED("#FF0000") {
        @Override
        void action(int a) {
            System.out.println(a * (-1));
        }
    }, GREEN(Colors.GREEN_CODE) {
        @Override
        void action(int a) {
            System.out.println(a + 1);
            
        }
    }, BLACK("#000000") {
        @Override
        void action(int a) {
            System.out.println(a + a);
            
        }
    };
    
    
    Color(String code) {
        this.code = code;
    }
    private String code;
    
    public String getCode() {
        return code;
    }
    
    abstract void action(int a) ;
    
    
    static Color getColor(String key) {
        switch (key) {
        case Colors.GREEN_CODE:
            return GREEN;
        case Colors.BLACK_CODE:
            return BLACK;
        case Colors.RED_CODE:
            return RED;
        default:
            break;
        }
        return null;
        
    }
}



class EnumTester {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        
        int x = 100;
        System.out.println();
        switch (color) {
        case BLACK:
            color.getCode();
            color.action(x);
            break;
        case GREEN:
            color.getCode();
            color.action(x);
            break;
        case RED:
            color.getCode();
            color.action(x);
            break;  
        default:
            break;
        }
        
        
        
    }
}