/*package ke.co.freddylyric.driverapp

import org.junit.Test
import com.google.common.truth.Truth.assertThat as assertThat1

class RegistrationUtilTest{
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                "",
                "123",
                "123"
        )
        assertThat1(result).isFalse()
        //assertThat(result).isFalse
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
                "Philipp",
                "123",
                "123"
        )
        assertThat1(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                "Carl",
                "123",
                "123"
        )
        assertThat1(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                "Philipp",
                "123456",
                "abcdefg"
        )
        assertThat1(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                "Philipp",
                "",
                ""
        )
        assertThat1(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
                "Philipp",
                "abcdefg5",
                "abcdefg5"
        )
        assertThat1(result).isFalse()
    }
}
*/