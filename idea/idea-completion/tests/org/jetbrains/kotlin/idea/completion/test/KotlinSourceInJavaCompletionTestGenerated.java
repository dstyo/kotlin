/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestMetadata("idea/idea-completion/testData/injava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinSourceInJavaCompletionTestGenerated extends AbstractKotlinSourceInJavaCompletionTest {
    public void testAllFilesPresentInInjava() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/injava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, false);
    }

    @TestMetadata("AnnotationParameter.java")
    public void testAnnotationParameter() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/AnnotationParameter.java", this::doTest);
    }

    @TestMetadata("Class.java")
    public void testClass() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/Class.java", this::doTest);
    }

    @TestMetadata("ClassMembers.java")
    public void testClassMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/ClassMembers.java", this::doTest);
    }

    @TestMetadata("ClassObject.java")
    public void testClassObject() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/ClassObject.java", this::doTest);
    }

    @TestMetadata("ClassObjectField.java")
    public void testClassObjectField() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/ClassObjectField.java", this::doTest);
    }

    @TestMetadata("ClassesFromNamespace.java")
    public void testClassesFromNamespace() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/ClassesFromNamespace.java", this::doTest);
    }

    @TestMetadata("EnumConstants.java")
    public void testEnumConstants() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/EnumConstants.java", this::doTest);
    }

    @TestMetadata("InterfaceDefaultImpl.java")
    public void testInterfaceDefaultImpl() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/InterfaceDefaultImpl.java", this::doTest);
    }

    @TestMetadata("InterfaceDefaultImplImportedMembers.java")
    public void testInterfaceDefaultImplImportedMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplImportedMembers.java", this::doTest);
    }

    @TestMetadata("InterfaceDefaultImplMembers.java")
    public void testInterfaceDefaultImplMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplMembers.java", this::doTest);
    }

    @TestMetadata("InterfaceDefaultImplStaticImportedMembers.java")
    public void testInterfaceDefaultImplStaticImportedMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplStaticImportedMembers.java", this::doTest);
    }

    @TestMetadata("InterfaceDefaultImplsNonImported.java")
    public void testInterfaceDefaultImplsNonImported() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplsNonImported.java", this::doTest);
    }

    @TestMetadata("MultiFileFacade.java")
    public void testMultiFileFacade() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/MultiFileFacade.java", this::doTest);
    }

    @TestMetadata("MultiFileFacadeMembers.java")
    public void testMultiFileFacadeMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/MultiFileFacadeMembers.java", this::doTest);
    }

    @TestMetadata("MultiFileFacadeNoImport.java")
    public void testMultiFileFacadeNoImport() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/MultiFileFacadeNoImport.java", this::doTest);
    }

    @TestMetadata("Nested.java")
    public void testNested() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/Nested.java", this::doTest);
    }

    @TestMetadata("NestedClassMembers.java")
    public void testNestedClassMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/NestedClassMembers.java", this::doTest);
    }

    @TestMetadata("NestedClassMembers2.java")
    public void testNestedClassMembers2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/NestedClassMembers2.java", this::doTest);
    }

    @TestMetadata("NestedNoImport.java")
    public void testNestedNoImport() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/NestedNoImport.java", this::doTest);
    }

    @TestMetadata("NestedObjectInstance.java")
    public void testNestedObjectInstance() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/NestedObjectInstance.java", this::doTest);
    }

    @TestMetadata("ObjectInClassObjects.java")
    public void testObjectInClassObjects() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/ObjectInClassObjects.java", this::doTest);
    }

    @TestMetadata("ObjectInstance.java")
    public void testObjectInstance() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/ObjectInstance.java", this::doTest);
    }

    @TestMetadata("RenamedFacade.java")
    public void testRenamedFacade() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/RenamedFacade.java", this::doTest);
    }

    @TestMetadata("SingleFileFacade.java")
    public void testSingleFileFacade() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/SingleFileFacade.java", this::doTest);
    }

    @TestMetadata("SingleFileFacadeMembers.java")
    public void testSingleFileFacadeMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/SingleFileFacadeMembers.java", this::doTest);
    }

    @TestMetadata("SingleFileFacadeNoImport.java")
    public void testSingleFileFacadeNoImport() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/SingleFileFacadeNoImport.java", this::doTest);
    }

    @TestMetadata("Subpackage.java")
    public void testSubpackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/Subpackage.java", this::doTest);
    }

    @TestMetadata("TopLevelMembers.java")
    public void testTopLevelMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/TopLevelMembers.java", this::doTest);
    }

    @TestMetadata("TraitMember.java")
    public void testTraitMember() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/injava/TraitMember.java", this::doTest);
    }
}
