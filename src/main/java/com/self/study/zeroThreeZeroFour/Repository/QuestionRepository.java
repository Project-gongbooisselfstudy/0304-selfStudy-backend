package com.self.study.zeroThreeZeroFour.Repository;

import com.self.study.zeroThreeZeroFour.domain.Question;
import java.util.List;
import java.util.Optional;

//문제 관련한 인터페이스 정의
public interface QuestionRepository {

    // 생성한 문제 저장
    Question save(Question question);

    // 생성한 문제전체 조회
    List<Question> listAllQuestion();

    // 생성한 문제번호로 조회
    Optional<Question> findById(int id);

}
