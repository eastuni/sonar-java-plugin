package cbp.bankware.standard.rules;

import java.util.List;

import org.sonar.plugins.java.api.JavaCheck;

import com.google.common.collect.ImmutableList;

import cbp.bankware.standard.rules.check.NotWorkingSpringAnnotationCheck;

public class CbpStandardRulesList {

	private CbpStandardRulesList() {
	}

	@SuppressWarnings("rawtypes")
	public static List<Class> getChecks() {
		return ImmutableList.<Class> builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
	}

	public static List<Class<? extends JavaCheck>> getJavaChecks() {
		return ImmutableList.<Class<? extends JavaCheck>> builder()
				.add(NotWorkingSpringAnnotationCheck.class)
				.build();
	}

	public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
		return ImmutableList.<Class<? extends JavaCheck>> builder()
				.build();
	}
}
