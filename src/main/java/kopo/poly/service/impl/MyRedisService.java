package kopo.poly.service.impl;

import kopo.poly.dto.RedisDTO;
import kopo.poly.persistance.redis.IMyRedisMapper;
import kopo.poly.service.IMyRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


@Slf4j
@Service("MyRedisService")
public class MyRedisService implements IMyRedisService {

    @Resource(name = "MyRedisMapper")
    private IMyRedisMapper myRedisMapper;

    @Override
    public int saveRedisString() throws Exception {
        log.info(this.getClass().getName() + ".saveRedisString Start!");

        String redisKey = "myRedis_String";

        RedisDTO pDTO = new RedisDTO();
        pDTO.setTest_text("난 String 타입으로 저장할 일반 문자열이다");

        int res = myRedisMapper.saveRedisString(redisKey, pDTO);

        log.info(this.getClass().getName() + "saveRedisString End!");

        return res;
    }

    @Override
    public RedisDTO getRedisString() throws Exception {
        log.info(this.getClass().getName() + ".getRedisString Start!");

        String redisKey = "myRedis_String";

        RedisDTO rDTO = myRedisMapper.getRedisString(redisKey);

        if (rDTO == null) {
            rDTO = new RedisDTO();
        }

        log.info(this.getClass().getName() + "getRedisString End!");

        return rDTO;
    }

    @Override
    public int saveRedisStringJSON() throws Exception {
        log.info(this.getClass().getName() + ".saveRedisStringJSON Start!");

        String redisKey = "myRedis_String_JSON";

        RedisDTO pDTO = new RedisDTO();
        pDTO.setTest_text("난 String 타입에 JSON 구조로 저장할 일반 문자열이다.");
        pDTO.setName("이지원");
        pDTO.setAddr("인천");
        pDTO.setEmail("iri@gmail.com");

        int res = myRedisMapper.saveRedisStringJSON(redisKey, pDTO);

        log.info(this.getClass().getName() + ".saveRedisStringJSON End!");

        return res;
    }

    @Override
    public int saveRedisHash() throws Exception {
        log.info(this.getClass().getName() + ".saveRedisHash Start!");

        String redisKey = "myRedis_Hash";

        RedisDTO pDTO = new RedisDTO();
        pDTO.setName("이지원");
        pDTO.setAddr("인천");
        pDTO.setEmail("irid@gmail.com");

        int res = myRedisMapper.saveRedisHash(redisKey, pDTO);

        log.info(this.getClass().getName() + ".saveRedisHash End!");

        return res;
    }

    @Override
    public RedisDTO getRedisHash() throws Exception {
        log.info(this.getClass().getName() + ".getRedisHash Start!");

        String redisKey = "myRedis_Hash";

        RedisDTO rDTO = myRedisMapper.getRedisHash(redisKey);

        if (rDTO == null) {
            rDTO = new RedisDTO();
        }

        log.info(this.getClass().getName() + ".getRedisHash End!");

        return rDTO;
    }

    @Override
    public int saveRedisSetJSONRamda() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisSetJSONRamda Start!");

        String redisKey = "myRedis_Set_JSON";

        Set<RedisDTO> pSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {

            RedisDTO pDTO = new RedisDTO();
            pDTO.setTest_text(i + "번째 데이터입니다.");
            pDTO.setName("이지원[" + i + "]");
            pDTO.setEmail("irid@gmail.com");

            pSet.add(pDTO);
            pDTO = null;
        }

        int res = myRedisMapper.saveRedisSetJSONRamda(redisKey, pSet);

        log.info(this.getClass().getName() + ".saveRedisSetJSONRamda End!");

        return res;
    }

    @Override
    public int saveRedisZSetJSON() throws Exception {

        log.info(this.getClass().getName() + ".saveRedisZSetJSON Start!");

        String redisKey = "myRedis_ZSet_JSON";

        List<RedisDTO> pList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            RedisDTO pDTO = new RedisDTO();
            pDTO.setTest_text(i + "번째 데이터입니다.");
            pDTO.setName("이지원[" + i + "]");
            pDTO.setAddr("인천");
            pDTO.setEmail("irid@gmail.com");

            pList.add(pDTO);
            pDTO = null;
        }

        int res = myRedisMapper.saveRedisZSetJSON(redisKey, pList);

        log.info(this.getClass().getName() + ".saveRedisZSetJSON End!");

        return res;
    }

    @Override
    public Set<RedisDTO> getRedisZSetJSON() throws Exception {

        log.info(this.getClass().getName() + ".getRedisZSetJSON Start!");

        String redisKey = "myRedis_ZSET_JSON";

        Set<RedisDTO> rSet = myRedisMapper.getRedisZSetJSON(redisKey);

        if (rSet == null) {
            rSet = new HashSet<>();

        }

        log.info(this.getClass().getName() + ".getRedisZSetJSON End!");

        return rSet;
    }

    @Override
    public boolean deleteDataJSON() throws Exception {

        log.info(this.getClass().getName() + ".deleteData Start!");

        String redisKey = "myRedis_ZSet_JSON";

        boolean res = myRedisMapper.deleteDataJSON(redisKey);

        log.info(this.getClass().getName() + ".deleteData End!");

        return res;
    }

    @Override
    public boolean deleteDataString() throws Exception {

        log.info(this.getClass().getName() + ".deleteDataString Start!");

        String redisKey = "myRedis_Hash";

        boolean res = myRedisMapper.deleteDataJSON(redisKey);

        log.info(this.getClass().getName() + ".deleteDataString End!");

        return res;
    }
}
