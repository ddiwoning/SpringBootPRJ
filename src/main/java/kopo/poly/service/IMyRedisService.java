package kopo.poly.service;

import kopo.poly.dto.RedisDTO;

import java.util.List;
import java.util.Set;

public interface IMyRedisService {

    /**
     * String 타입 저장하기
     */
    int saveRedisString() throws Exception;

    /**
     * String 타입 가져오기
     */
    RedisDTO getRedisString() throws Exception;

    /**
     * String 타입 가져오기
     */
    int saveRedisStringJSON() throws Exception;

    /**
     * Hash 타입에 문자열 형태로 저장하기
     */
    int saveRedisHash() throws Exception;

    /**
     * Hash 타입에 문자열 형태로 저장하기
     */
    RedisDTO getRedisHash() throws Exception;

    /**
     * Set 타입에 JSON 형태로 람다식을 이용하여 저장하기
     */
    int saveRedisSetJSONRamda() throws Exception;

    /**
     * ZSet 타입에 JSON 형태로 저장하기
     */
    int saveRedisZSetJSON() throws Exception;

    /**
     *ZSet 타입에 JSON 형태로 저장된 값 가져오가
     */
    Set<RedisDTO> getRedisZSetJSON() throws Exception;

    /**
     * Redis에 JSON 구조로 저장된 데이터 삭제하기
     */
    boolean deleteDataJSON() throws Exception;

    /**
     * Redis에 String 구조로 저장된 데이터 삭제하기
     */
    boolean deleteDataString() throws Exception;
}