package net.feak.citest;

import org.junit.Test;

import com.google.common.truth.Truth;

public class TokenResourceTest {

    @Test
    public void testId() {
        Token token = new TokenResource().getToken("TestId");
        Truth.assertThat(token.getId()).isEqualTo("TestId");
    }

}
