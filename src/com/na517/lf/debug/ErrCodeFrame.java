/** 
 * @项目名称：InterfaceDebug   
 * @文件名：ErrCodeFrame.java    
 * @版本信息：
 * @日期：2015年6月25日    
 * @Copyright 2015 www.517na.com Inc. All rights reserved.         
 */
package com.na517.lf.debug;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

/**    
 *     
 * @项目名称：InterfaceDebug    
 * @类名称：ErrCodeFrame    
 * @类描述：    
 * @创建人：lianfeng    
 * @创建时间：2015年6月25日 上午10:38:55    
 * @修改人：lianfeng    
 * @修改时间：2015年6月25日 上午10:38:55    
 * @修改备注：    
 * @version     
 *     
 */
public class ErrCodeFrame extends JFrame {
    
    /**    
     * serialVersionUID:TODO（用一句话描述这个变量表示什么）    
     *    
     * @since Ver 1.1    
     */    
    private static final long serialVersionUID = 1L;
    
    private static Frame mFrame;
    
    private JPanel contentPane;
    
    private JList listErrCode;
    
    public static final String ERR_NOTE = "0-失败数据|"
            + "1-请求格式错误|"
            + "2-请求参数错误|"
            + "3-未获取到用户信息|"
            + "4-用户价格小于平台支付价格|"
            + "5-更新编码状态出错|"
            + "6-编码状态出错,位置被NO或编码被取消|"
            + "7-Token无效|"
            + "8-签名验证不通过|"
            + "9-UUID不能为空|"
            + "10-Token为空|"
            + "11-action为空|"
            + "12-MachineCode（设备码）为空|"
            + "13-data为空|"
            + "14-DepData起飞日期为空|"
            + "15-OrgCity出发城市为空|"
            + "16-DstCity到达城市为空|"
            + "17-FlightWay行程类型 单程 往返为空|"
            + "18-SortType排序方式为空|"
            + "19-QueryType查询方式为空|"
            + "20-PageSize条数为空|"
            + "21-PageIndex页码为空|"
            + "22-TotalPrice价格为空|"
            + "23-Tel电话为空|"
            + "24-Name姓名为空|"
            + "25-Cantact联系人信息为空|"
            + "26-Delivery航程信息为空|"
            + "27-DeliveryType配送类型为空|"
            + "28-ExpressNo快递单号为空|"
            + "29-Mobile电话为空|"
            + "30-Sequence为空|"
            + "31-FlightNo航班号为空|"
            + "32-OrgJetquay始发航站楼为空|"
            + "33-DstJetquay到达航站楼为空|"
            + "34-SeatClass仓位为空|"
            + "35-TakeffTime起飞时间为空|"
            + "36-SeatMsg仓位说明为空|"
            + "37-Discount折扣为空|"
            + "38-ArrTime到达时间为空|"
            + "39-RatePoint 返点 为空|"
            + "40-PolicyId政策ID为空|"
            + "41-AduTicketPrice成人票价为空|"
            + "42-AduAirBuid成人基建为空|"
            + "43-AduOil成人燃油为空|"
            + "44-Gender性别为空|"
            + "45-Ptype乘客类型为空|"
            + "46-IdType证件类型为空|"
            + "47-IdNo证件号码为空|"
            + "48-VoyageInfo航程信息为空|"
            + "49-PassengerList乘客信息为空|"
            + "50-PnrInfos订单信息为空|"
            + "51-OrderNo客户端订单为空|"
            + "52-Paytype支付类型为空|"
            + "53-AirLine航司为空|"
            + "54-密码错误|"
            + "55-禁止登录|"
            + "56-政策为空|"
            + "57-没有渠道订单详情|"
            + "58-订单编码失败|"
            + "59-PlaneType 机型为空|"
            + "60-不加失败|"
            + "61-票面价为0，不能生成订单|"
            + "62-新增卖出订单信息失败|"
            + "63-选择日期超出规定|"
            + "65-Token过期|"
            + "1001-客户端没有网络 |"
            + "1002-连接超时|"
            + "1003-服务器端响应失败|"
            + "1004-数据解析错误|"
            + "1005-参数错误|"
            + "1006-取消请求|"
            + "1007-未知错误";
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ErrCodeFrame frame = new ErrCodeFrame();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * @description 获得实例，单例模式
     * @date 2015年6月25日
     * @return
     */
    public static ErrCodeFrame getInstance() {
        if (mFrame == null) {
            mFrame = new ErrCodeFrame(); 
        }
        
        return (ErrCodeFrame) mFrame;
    }
    
    /**
     * Create the frame.
     */
    private ErrCodeFrame() {
        mFrame = this;
        setTitle("错误码");
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 215, 240);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        listErrCode = new JList<Object>();
        JScrollPane spanelRequest = new JScrollPane(listErrCode);
        spanelRequest.setBounds(5, 5, 200, 200);
        contentPane.add(spanelRequest);
        
        setResizable(false);
        
        mFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent arg0) {
                DefaultListModel listModel = new DefaultListModel();
                String[] allNote = ERR_NOTE.split("\\|");
                for (String str : allNote) {
                    listModel.addElement(str);
                }
                
                listErrCode.setModel(listModel);
            }
            @Override
            public void windowIconified(WindowEvent arg0) {
            }
            @Override
            public void windowDeiconified(WindowEvent arg0) {
            }
            @Override
            public void windowDeactivated(WindowEvent arg0) {
            }
            @Override
            public void windowClosing(WindowEvent arg0) {
                mFrame.setVisible(false);
            }
            @Override
            public void windowClosed(WindowEvent arg0) {
            }
            @Override
            public void windowActivated(WindowEvent arg0) {
            }
        });
    }
}
