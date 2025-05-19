package com.camp.controller;

import java.sql.Date;
import java.util.List;

import com.camp.model.CampService;
import com.camp.model.CampVO;

public class TestCamp {

    public static void main(String[] args) {
        CampService campSvc = new CampService();
        // CampVO campVO = new CampVO();
        // // 新增營地
        // // campSvc.addCamp(0, null, null, null, null, null, 0, null, null, null,
        // null,
        // // 0, 0, null)
        // // 建立假圖片資料
        // byte[] dummyPic = "fake image bytes".getBytes(); // 模擬圖片資料
        // // campVO = campSvc.addCamp(10000005, "JAVA營地", "JAVA營地內容設定", "桃園市", "復興鄉",
        // // "464號", 0, dummyPic, dummyPic, null, null, 12,
        // // 60, "2025-05-12");

        // // Date sqlDate = new Date(System.currentTimeMillis());
        // CampVO newCamp = campSvc.addCamp(
        // 10000005, // ownerId
        // "陽明山小木屋", // campName
        // "擁有絕佳山景與溫泉的營地", // campContent
        // "台北市", // campCity
        // "北投區", // campDist
        // "泉源路123號", // campAddr
        // (byte) 1, // campReleaseStatus (1 = 上架)
        // dummyPic, // campPic1
        // dummyPic, // campPic2
        // null, // campPic3
        // null, // campPic4
        // 0, // campCommentNumberCount
        // 0, // campCommentSumScore
        // Date.valueOf("2025-03-15") // campRegDate
        // );
        // System.out.println("OKK");

        // 查詢所有營地
        List<CampVO> campVOList = campSvc.getAll();
        for (CampVO campVO : campVOList) {
            System.out.println(campVO.getCampName() + " " + campVO.getOwnerId() + " " +
                    campVO.getCampCity());
        }
    }

}
