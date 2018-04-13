/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers.javac;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/foreignAnnotationsJava8/tests")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JavacForeignJava8AnnotationsTestGenerated extends AbstractJavacForeignJava8AnnotationsTest {
    public void testAllFilesPresentInTests() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotationsJava8/tests"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("checkerFramework.kt")
    public void testCheckerFramework() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/checkerFramework.kt", this::doTest);
    }

    @TestMetadata("eclipse.kt")
    public void testEclipse() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/eclipse.kt", this::doTest);
    }

    @TestMetadata("typeUseOnObject.kt")
    public void testTypeUseOnObject() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeUseOnObject.kt", this::doTest);
    }

    @TestMetadata("compiler/testData/foreignAnnotationsJava8/tests/jsr305")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jsr305 extends AbstractJavacForeignJava8AnnotationsTest {
        public void testAllFilesPresentInJsr305() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotationsJava8/tests/jsr305"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultAnnotationAppliedToType.kt")
        public void testDefaultAnnotationAppliedToType() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/defaultAnnotationAppliedToType.kt", this::doTest);
        }

        @TestMetadata("defaultAnnotationAppliedToTypeForCompiledJava.kt")
        public void testDefaultAnnotationAppliedToTypeForCompiledJava() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/defaultAnnotationAppliedToTypeForCompiledJava.kt", this::doTest);
        }

        @TestMetadata("springNullableWithTypeUse.kt")
        public void testSpringNullableWithTypeUse() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/springNullableWithTypeUse.kt", this::doTest);
        }

        @TestMetadata("typeArguments.kt")
        public void testTypeArguments() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/typeArguments.kt", this::doTest);
        }

        @TestMetadata("typeUseVsMethodConflict.kt")
        public void testTypeUseVsMethodConflict() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/typeUseVsMethodConflict.kt", this::doTest);
        }
    }

    @TestMetadata("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeEnhancement extends AbstractJavacForeignJava8AnnotationsTest {
        public void testAllFilesPresentInTypeEnhancement() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("annotatedTypeArguments.kt")
        public void testAnnotatedTypeArguments() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/annotatedTypeArguments.kt", this::doTest);
        }

        @TestMetadata("methodWithTypeParameter.kt")
        public void testMethodWithTypeParameter() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/methodWithTypeParameter.kt", this::doTest);
        }

        @TestMetadata("notNullVarargsOverrides.kt")
        public void testNotNullVarargsOverrides() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/notNullVarargsOverrides.kt", this::doTest);
        }

        @TestMetadata("nullableVarargsOverrides.kt")
        public void testNullableVarargsOverrides() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/nullableVarargsOverrides.kt", this::doTest);
        }

        @TestMetadata("returnTypeDifferentConstructor.kt")
        public void testReturnTypeDifferentConstructor() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/returnTypeDifferentConstructor.kt", this::doTest);
        }

        @TestMetadata("returnTypeOverrideInKotlin.kt")
        public void testReturnTypeOverrideInKotlin() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/returnTypeOverrideInKotlin.kt", this::doTest);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/simple.kt", this::doTest);
        }
    }
}
