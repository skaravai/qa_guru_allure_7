package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.annotation.*;

public class LabelsTest {

    @Test
    @Owner("s_karavai")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Task in repository")
    @Story("Ability to see created issues in repository")
    @DisplayName("My favorite test")
    @Link(value = "Testing", url = "https://github.com ")
    public void testAnnotated() {

    }

    @Test
    public void testCode() {
        Allure.label("Owner", "skaravai");
        Allure.label("Severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Task in repository");
        Allure.story("Ability to see created issues in repository");
        Allure.link("Testing", "https://github.com");
    }

    @Documented
    @Owner("s_karavai")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Tasks in repository")
    @Story("Ability to see created issues in repository")
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IssueShow {

    }
}
