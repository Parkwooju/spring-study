package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;

public class MemberPrinter {
    private DateTimeFormatter dateTimeFormatter;

    public MemberPrinter() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println("MemberPrinter:: " + dateTimeFormatter);

    }

    public void print(Member member) {
        if (dateTimeFormatter == null) {
            System.out.printf(
                    "회원 정보 : 아이디 = %d, 이메일 = %s, 이름 = %s, 등록일 = %tF\n",
                    member.getId(), member.getEmail(), member.getName(),
                    member.getRegisterDateTime()
            );
        } else {
            System.out.printf(
                    "회원 정보: 아이디 = %d, 이메일 = %s, 이름 = %s, 등록일 = %s\n",
                    member.getId(), member.getEmail(), member.getName(),
                    dateTimeFormatter.format(member.getRegisterDateTime()));
        }
    }

    // 주입할 대상이 필수가 아닌 경우
//    @Autowired(required = false)
    @Autowired
    // @Nullable 애노테이션을 사용하면 일치하는 빈이 없을 때 null 값을 할당한다.
    public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
        System.out.println(dateTimeFormatter);
        this.dateTimeFormatter = dateTimeFormatter;
    }
}
