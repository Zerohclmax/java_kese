package keshe;

public class Time {
    private int hour;//时
    private int minute;//分
    private int second;//秒
    public Time(int hour,int minute,int second){//构造方法
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void change_second(int chasecond){//加或减秒
        if(chasecond>0){//加秒
            if(chasecond>=60){
                int x = chasecond%60;
                this.second+=x;
                if(second>=60){
                    this.second-=60;
                    this.minute+=1;
                }
                this.minute+=(chasecond-x)/60;
                if(minute>=60){
                    x = minute%60;
                    this.hour+=(minute-x)/60;
                    this.minute=x;
                    if(hour>=24){
                        this.hour-=24;
                }

                }
            }else{
                this.second+=chasecond;
                if(second>=60){
                    this.second-=60;
                    this.minute+=1;
                    if(minute>=60){
                        this.minute-=60;
                        this.hour+=1;
                        if(hour>=24){
                            this.hour-=24;
                        }
                    }
                }
            }
        }else{//减秒
            chasecond = Math.abs(chasecond);
            if(chasecond>=60){
                int x = chasecond%60;
                this.second-=x;
                if(second<0){
                    this.second=second+60;
                    this.minute-=1;
                }
                this.minute-=(chasecond-x)/60;
                if(minute<0){
                    x = minute%60;
                    this.hour-=(minute-x)/60;
                    this.minute=x+60;
                    if(hour<0){
                        this.hour+=24;
                    }
                }
            }else{
                this.second-=chasecond;
                if(second<0){
                    this.second+=60;
                    this.minute-=1;
                    if(minute<0){
                        this.minute+=60;
                        this.hour-=1;
                        if(hour<0){
                            this.hour+=24;
                        }
                    }
                }
            }

        }
    }
    public void change_minute(int chaminute){//加或减分
        if(chaminute>0){//加分
            if(chaminute>=60){
                int x = chaminute%60;
                this.minute+=x;
                if(minute>=60){
                    this.minute-=60;
                    this.hour+=1;
                }
                this.hour+=(chaminute-x)/60;
                if(hour>=24){
                    this.hour=hour%24;
                }
            }else{
                this.minute+=chaminute;
                if(minute>=60){
                    this.minute-=60;
                    this.hour+=1;
                    if(hour>=24){
                        this.hour-=24;
                    }
                }

            }
        }else{//减分
            chaminute = Math.abs(chaminute);
            if(chaminute>=60){
                int x = chaminute%60;
                this.minute-=x;
                if(minute<0){
                    this.minute+=60;
                    this.hour-=1;
                }
                this.hour-=(chaminute-x)/60;
                if(hour<0){
                    this.hour=-(hour%24);
                }
            }else{
                this.minute-=chaminute;
                if(minute<0){
                    this.minute+=60;
                    this.hour-=1;
                    if(hour<0){
                        this.hour+=24;
                    }
                }

            }
        }
    }
    public void change_hour(int cha_hour){//加或减时
        if(cha_hour>0){//加时
            this.hour+=cha_hour;
            if(hour>=24){
                this.hour-=24;
            }
        }else{//减分
            cha_hour = Math.abs(cha_hour);
            this.hour-=cha_hour;
            if(hour<0){
                this.hour+=24;
            }
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
