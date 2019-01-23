package pattern.state;

/**
 * 模拟酒店系统，房间的状态
 */
public class AlawyAction {
    private String state;

    /*
      当这种需要频繁修改状态时，考虑使用状态模式
     */
    public void HomeState(String sta ,String tag){
        if(sta == "空闲"){
            if(tag == "预订房间"){
                System.out.println("预定操作");
                this.state = "已预订";
            }else if(tag == "驻进房间"){
                System.out.println("入住操作");
                this.state = "已入住";
            }
        }else if(sta == "已预订"){
            if(tag == "驻进房间"){
                System.out.println("入住操作");
                this.state = "已入住";
            }else if(tag =="取消预定"){
                System.out.println("取消操作");
                this.state = "空闲";
            }
        }else if(sta == "已入住"){
            if(tag == "取消预定"){
                System.out.println("取消操作");
                this.state = "空闲";
            }
        }

    }
}
