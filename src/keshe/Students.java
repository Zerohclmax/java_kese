package keshe;

public class Students {
    private static int temp = 1900;//静态中间变量
    private int stu_number;//学号
    private String stu_name;//姓名
    private String stu_hobby;//爱好
    private float stu_aver;//平均绩点
    public Students(){//无参构造函数
        temp++;
        this.stu_number = temp;
    }
    public Students(String stu_name,String stu_hobby){//有参构造函数
        this.stu_name = stu_name;
        this.stu_hobby = stu_hobby;
        temp++;
        this.stu_number = temp;
    }
    public int getStu_number() {//输出学号
        return stu_number;
    }
    public void setStu_name(String stu_name) {//修改或输入学生名字
        this.stu_name = stu_name;
    }
    public String getStu_name() {//输出学生名字
        return stu_name;
    }
    public void setStu_hobby(String stu_hobby) {//修改或输入爱好
        this.stu_hobby = stu_hobby;
    }
    public String getStu_hobby() {//输出爱好
        return stu_hobby;
    }
    //计算平均绩点方法（共三课数学,英语,物理满分各100;60分绩点为1,往上每1分为0.1绩点,100分为5个绩点）
    public void countstu_aver(float[] List){//计算平均成绩点
        double[] list = new double[3];
        for(int i=0;i<List.length;i++){
            if(List[i]>=60){
                list[i] = (List[i]-60)*0.1;
            }else{
                list[i] = 0;
            }
        }
        for(double x:list) {
            this.stu_aver += x;
        }
        this.stu_aver = stu_aver/3;
    }
    public float getStu_aver() {//输出平均绩点
        return stu_aver;
    }
    public static int get_number(){//输出人数(静态方法)
        return (temp-1900);
    }
    @Override
    public String toString() {
        return "Students{" +
                "stu_number(学号)=" + stu_number +
                ", stu_name（姓名）='" + stu_name + '\'' +
                ", stu_hobby（爱好）='" + stu_hobby + '\'' +
                ", stu_aver（平均绩点）=" + stu_aver +
                '}';
    }
}
class text1{
    public static void main(String[] args) {
        Students first = new Students("kk","study1");
        Students second = new Students("gg","study2");
        Students third = new Students("ff","study3");
        first.setStu_name("ll");//修改名字
        System.out.println("kk修改名字后是:"+first.getStu_name()+";学号是:"+first.getStu_number());//输出新名字和学号
        second.setStu_hobby("play1");//修改爱好
        System.out.println("gg修改爱好后是:"+first.getStu_hobby()+";学号是:"+second.getStu_number());//输出新爱好和学号
        System.out.println("现有人数是:"+Students.get_number());
        float[] x = new float[]{78,80,98};//设置3个成绩
        first.countstu_aver(x);//计算平均绩点
        float[] y = new float[]{89,90,78};//设置3个成绩
        second.countstu_aver(y);//计算平均绩点
        System.out.println(first);
        System.out.println(second);


    }
}
