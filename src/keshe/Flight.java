package keshe;

public class Flight {
    private String Flight_type;//机型
    private String Flight_num;//班次
    private int Flight_all;//额定人数
    private int Flight_load;//实际人数
    public Flight(){}//无参构造方法
    public Flight(String Flight_type,String Flight_num,int Flight_all,int Flight_load){//有参构造方法
        this.Flight_type = Flight_type;
        this.Flight_num = Flight_num;
        this.Flight_all = Flight_all;
        this.Flight_load = Flight_load;
    }

    public void setFlight_type(String Flight_type){//输入或修改机型
        this.Flight_type = Flight_type;
    }
    public String getFlight_type(){//输出机型
        return this.Flight_type;
    }
    public void setFlight_num(String Flight_num){//输入或修改班次
        this.Flight_num = Flight_num;
    }
    public String getFlight_num(){//输出班次
        return this.Flight_num;
    }
    public void setFlight_all(int Flight_all){//输入或修改额定人数
        this.Flight_all = Flight_all;
    }
    public int getFlight_all(){//输出额定人数
        return this.Flight_all;
    }
    public void setFlight_load(int Flight_load){//输入或修改实际人数
        this.Flight_load = Flight_load;
    }
    public int getFlight_load(){//输出实际人数
        return this.Flight_load;
    }
    public float busload(){//载客率
        return ((float)Flight_load/Flight_all);
    }
    @Override
    public String toString() {//toString重载方法
        return "Flight{" +
                "Flight_type='" + Flight_type + '\'' +
                ", Flight_num='" + Flight_num + '\'' +
                ", Flight_all=" + Flight_all +
                ", Flight_load=" + Flight_load +
                '}';
    }
}
