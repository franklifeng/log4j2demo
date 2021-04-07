/**
 * projectName: transfer-svr
 * fileName: TransferMain.java
 * packageName: com.th.supcom.hlwyy.transferserver.main
 * date: 2020-12-22 10:08
 * copyright(c) 2017-2020 cenboomh
 */
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @version: V1.0
 * @author: fli
 * @className: TransferMain
 * @packageName: com.th.supcom.hlwyy.transferserver.main
 * @description: 运行jar主函数
 * @data: 2020-12-22 10:08
 **/
public class TransferMain {
    private static final Logger logger = LoggerFactory.getLogger(TransferMain.class);


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /**
         * java.sql.Date是为了配合SQL DATE而设置的数据类型。
         * “规范化”的java.sql.Date只包含年月日信息，时分秒毫秒都会清零。
         * 格式类似：YYYY-MM-DD。当我们调用ResultSet的getDate()方法来获得返回值时，
         * java程序会参照"规范"的java.sql.Date来格式化数据库中的数值
         * 要保存java.util.Date的精确值，我们需要利用java.sql.Timestamp
         */
        boolean flag = true;
        String startDate = "";
        String endDate = "";
        while (flag){
            System.out.println("说明：日期格式为 yyyyMMdd，表示20201219 表示 20201219 00:00:00,");
            System.out.println("请输入开始日期，格式为 yyyyMMdd");
            startDate = scanner.nextLine();
            System.out.println("请输入结束日期，格式为 yyyyMMdd");
            endDate = scanner.nextLine();

            System.out.println("请确认输入时间区间:" + startDate + " 00:00:00" + " - " + endDate + " 00:00:00");
            System.out.println("请输入： 1 确认执行 2 重新输入");
            String submit = scanner.nextLine();
            if ("1".equals(submit)){
                flag = false;
            }
        }

        logger.error("开始删除下载到本地的图片和语音");
        String path = "C:\\Download" + "/temp";
        File file = new File(path);
        logger.error("删除下载到本地的图片和语音完成");
        logger.error("删除下载到本地的图片和语音完成");

        logger.error("开始时间：{}，结束时间：{}，迁移数据量为：{},未查询到迁移数据",startDate, endDate, 0);
    }





}
