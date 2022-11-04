//package cn.config;
//
//import com.alibaba.otter.canal.protocol.CanalEntry;
//import com.xpand.starter.canal.annotation.CanalEventListener;
//import com.xpand.starter.canal.annotation.ListenPoint;
//
///**
// * 监控Business库下的表
// */
//@CanalEventListener
//public class BusinessListener {
//
//    /**
//     * 设置监控点，监控的目标，对应库下的具体表
//     * @param entryType
//     * @param rowData
//     */
//    @ListenPoint(schema = "xmh",table = {"t_user"})
//    public void adUpdate(CanalEntry.EntryType entryType, CanalEntry.RowData rowData){
//        System.out.println("tb_ad表中的数据发生变化");
//        System.out.println("变化前的数据");
//        rowData.getBeforeColumnsList().forEach((c)-> System.out.println(c.getName()+":"+c.getValue()));
//        System.out.println("变化后的数据");
//        rowData.getAfterColumnsList().forEach((c)-> System.out.println(c.getName()+":"+c.getValue()));
//    }
//}
