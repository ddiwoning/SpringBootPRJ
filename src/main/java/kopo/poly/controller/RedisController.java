package kopo.poly.controller;

import kopo.poly.dto.RedisDTO;
import kopo.poly.service.IMyRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Slf4j
@RestController
public class RedisController {

    @Resource(name = "MyRedisService")
    private IMyRedisService myRedisService;

    /**
     * Redis 문자열 저장 실습
     */
    @GetMapping(value = "redis/saveRedisString")
    public String saveRedisString() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisString Start!");

        // 수집 결과 출력
        String msg;

        int res = myRedisService.saveRedisString();

        if (res == 1) {
            msg = "success";

        } else {
            msg = "fail";
        }

        log.info(this.getClass().getName() + "saveRedisString End!");

        return msg;
    }

    /**
     * Redis 문자열 저장된 값 가져오기
     */
    @GetMapping(value = "redis/getRedisString")
    public RedisDTO getRedisString() throws Exception {

        log.info(this.getClass().getName() + ".getRedisString Start!");

        RedisDTO rDTO = myRedisService.getRedisString();

        log.info(this.getClass().getName() + "getRedisString End!");

        return rDTO;
    }

    /**
     * Redis 문자열을 JSON으로 저장 실습
     */
    @GetMapping(value = "redis/saveRedisStringJSON")
    public String saveRedisStringJSON() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisStringJSON Start!");

        // 수집 결과 출력
        String msg;

        int res = myRedisService.saveRedisStringJSON();

        if (res == 1) {
            msg = "success";

        } else {
            msg = "fail";
        }

        log.info(this.getClass().getName() + ".saveRedisStringJSON End!");

        return msg;
    }

    /**
     * Hash 타입에 문자열 형태로 저장하기
     */
    @GetMapping(value = "redis/saveRedisHash")
    public String saveRedisHash() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisHash Start!");

        // 수집 결과 출력
        String msg;

        int res = myRedisService.saveRedisHash();

        if (res == 1) {
            msg = "success";

        } else {
            msg = "fail";
        }

        log.info(this.getClass().getName() + ".saveRedisHash End!");

        return msg;
    }

    /**
     * Hash 타입에 문자열 형태로 저장된 값 가져오기
     */
    @GetMapping(value = "redis/getRedisHash")
    public RedisDTO getRedisHash() throws Exception {

        log.info(this.getClass().getName() + ".getRedisHash Start!");

        RedisDTO rDTO = myRedisService.getRedisHash();

        log.info(this.getClass().getName() + ".getRedisHash End!");

        return rDTO;
    }

    /**
     * Set타입에 JSON 형태로 람다식을 이용하여 저장하기
     */
    @GetMapping(value = "redis/saveRedisSetJSONRamda")
    public String saveRedisSetJSONRamda() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisSetJSONRamda Start!");

        // 수집 결과 출력
        String msg;

        int res = myRedisService.saveRedisSetJSONRamda();

        if (res == 1) {
            msg = "success";

        } else {
            msg = "fail";
        }

        log.info(this.getClass().getName() + ".saveRedisSetJSONRamda End!");

        return msg;
    }

    /**
     * ZSet타입에 JSON 형태로 람다식을 이용하여 저장하기
     */
    @GetMapping(value = "redis/saveRedisZSetJSON")
    public String saveRedisZSetJSON() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisZSetJSON Start!");

        // 수집 결과 출력
        String msg;

        int res = myRedisService.saveRedisZSetJSON();

        if (res == 1) {
            msg = "success";

        } else {
            msg = "fail";
        }

        log.info(this.getClass().getName() + ".saveRedisZSetJSON End!");

        return msg;
    }

    /**
     * ZSet 타입에 JSON 형태로 저장된 값 가져오기
     */
    @GetMapping(value = "redis/getRedisZSetJSON")
    public Set<RedisDTO> getRedisZSetJSON() throws Exception {

        log.info(this.getClass().getName() + ".getRedisZSetJSON Start!");

        Set<RedisDTO> rSet = myRedisService.getRedisZSetJSON();

        log.info(this.getClass().getName() +".getRedisZSetJSON End!");

        return rSet;
    }

    /**
     * RedisDB 데이터 삭제
     */
    @GetMapping(value = "redis/deleteDataJSON")
    public boolean deleteDataJSON() throws Exception {

        log.info(this.getClass().getName() + ".deleteDataJSON Start!");

        boolean res = myRedisService.deleteDataJSON();

        log.info(this.getClass().getName() + ".deleteDataJSON End!");

        return res;
    }

    /**
     * RedisDB 데이터 삭제
     */
    @GetMapping(value = "redis/deleteDataString")
    public boolean deleteDataString() throws Exception {

        log.info(this.getClass().getName() + "/deleteDataString Start!");

        boolean res = myRedisService.deleteDataString();

        log.info(this.getClass().getName() + ".deleteDataString End!");

        return res;
    }
}
