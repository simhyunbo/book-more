package site.bookmore.bookmoreserver.alarms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alarms")
public class AlarmController {


    // 팔로잉의 리뷰 등록 알림 - GET /api/v1/alarms/reviews

    // 나를 팔로잉 하면 알림 - GET /api/v1/alarms/follow

    // 내 리뷰에 좋아요 알림 - GET /api/v1/alarms/likes

}
