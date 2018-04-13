/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

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
@TestMetadata("compiler/testData/codegen/java8/box")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BlackBoxWithJava8CodegenTestGenerated extends AbstractBlackBoxCodegenTest {
    public void testAllFilesPresentInBox() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("async.kt")
    public void testAsync() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/async.kt", this::doTest);
    }

    @TestMetadata("asyncException.kt")
    public void testAsyncException() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/asyncException.kt", this::doTest);
    }

    @TestMetadata("capturedSuperCall.kt")
    public void testCapturedSuperCall() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/capturedSuperCall.kt", this::doTest);
    }

    @TestMetadata("defaultMethodCallFromInterface.kt")
    public void testDefaultMethodCallFromInterface() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/defaultMethodCallFromInterface.kt", this::doTest);
    }

    @TestMetadata("defaultMethodCallViaClass.kt")
    public void testDefaultMethodCallViaClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/defaultMethodCallViaClass.kt", this::doTest);
    }

    @TestMetadata("defaultMethodCallViaInterface.kt")
    public void testDefaultMethodCallViaInterface() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/defaultMethodCallViaInterface.kt", this::doTest);
    }

    @TestMetadata("defaultMethodOverride.kt")
    public void testDefaultMethodOverride() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/defaultMethodOverride.kt", this::doTest);
    }

    @TestMetadata("dontDelegateToDefaultMethods.kt")
    public void testDontDelegateToDefaultMethods() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/dontDelegateToDefaultMethods.kt", this::doTest);
    }

    @TestMetadata("functionAssertion.kt")
    public void testFunctionAssertion() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/functionAssertion.kt", this::doTest);
    }

    @TestMetadata("inheritKotlin.kt")
    public void testInheritKotlin() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/inheritKotlin.kt", this::doTest);
    }

    @TestMetadata("invokeDefaultViaSuper.kt")
    public void testInvokeDefaultViaSuper() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/invokeDefaultViaSuper.kt", this::doTest);
    }

    @TestMetadata("invokeDefaultViaSuper_16.kt")
    public void testInvokeDefaultViaSuper_16() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/invokeDefaultViaSuper_16.kt", this::doTest);
    }

    @TestMetadata("longChainOfKotlinExtendsFromJavaWithDefault.kt")
    public void testLongChainOfKotlinExtendsFromJavaWithDefault() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/longChainOfKotlinExtendsFromJavaWithDefault.kt", this::doTest);
    }

    @TestMetadata("removeIf.kt")
    public void testRemoveIf() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/removeIf.kt", this::doTest);
    }

    @TestMetadata("samOnInterfaceWithDefaultMethod.kt")
    public void testSamOnInterfaceWithDefaultMethod() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/samOnInterfaceWithDefaultMethod.kt", this::doTest);
    }

    @TestMetadata("stream.kt")
    public void testStream() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/stream.kt", this::doTest);
    }

    @TestMetadata("streamBackwardCompatibility.kt")
    public void testStreamBackwardCompatibility() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/streamBackwardCompatibility.kt", this::doTest);
    }

    @TestMetadata("useStream.kt")
    public void testUseStream() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/useStream.kt", this::doTest);
    }

    @TestMetadata("compiler/testData/codegen/java8/box/builtinStubMethods")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class BuiltinStubMethods extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInBuiltinStubMethods() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/builtinStubMethods"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("immutableRemove.kt")
        public void testImmutableRemove() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/builtinStubMethods/immutableRemove.kt", this::doTest);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/delegationBy")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DelegationBy extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInDelegationBy() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/delegationBy"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("byMiddleInterface.kt")
        public void testByMiddleInterface() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/byMiddleInterface.kt", this::doTest);
        }

        @TestMetadata("defaultOverride.kt")
        public void testDefaultOverride() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/defaultOverride.kt", this::doTest);
        }

        @TestMetadata("delegationToMap.kt")
        public void testDelegationToMap() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/delegationToMap.kt", this::doTest);
        }

        @TestMetadata("diamond.kt")
        public void testDiamond() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/diamond.kt", this::doTest);
        }

        @TestMetadata("diamond2.kt")
        public void testDiamond2() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/diamond2.kt", this::doTest);
        }

        @TestMetadata("inClassDeclaration.kt")
        public void testInClassDeclaration() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/inClassDeclaration.kt", this::doTest);
        }

        @TestMetadata("mixed.kt")
        public void testMixed() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/mixed.kt", this::doTest);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/simple.kt", this::doTest);
        }

        @TestMetadata("simple1.0.kt")
        public void testSimple1_0() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/delegationBy/simple1.0.kt", this::doTest);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/jvm8")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm8 extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInJvm8() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("bridgeInClass.kt")
        public void testBridgeInClass() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/bridgeInClass.kt", this::doTest);
        }

        @TestMetadata("bridgeInInterface.kt")
        public void testBridgeInInterface() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/bridgeInInterface.kt", this::doTest);
        }

        @TestMetadata("capturedSuperCall.kt")
        public void testCapturedSuperCall() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/capturedSuperCall.kt", this::doTest);
        }

        @TestMetadata("defaultArgs.kt")
        public void testDefaultArgs() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaultArgs.kt", this::doTest);
        }

        @TestMetadata("inlineFromAnotherFile.kt")
        public void testInlineFromAnotherFile() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/inlineFromAnotherFile.kt", this::doTest);
        }

        @TestMetadata("inlineFromStdlib.kt")
        public void testInlineFromStdlib() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/inlineFromStdlib.kt", this::doTest);
        }

        @TestMetadata("kt11969.kt")
        public void testKt11969() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt11969.kt", this::doTest);
        }

        @TestMetadata("kt14243.kt")
        public void testKt14243() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt14243.kt", this::doTest);
        }

        @TestMetadata("kt14243_2.kt")
        public void testKt14243_2() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt14243_2.kt", this::doTest);
        }

        @TestMetadata("kt14243_prop.kt")
        public void testKt14243_prop() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt14243_prop.kt", this::doTest);
        }

        @TestMetadata("kt16581.kt")
        public void testKt16581() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt16581.kt", this::doTest);
        }

        @TestMetadata("kt16581_2.kt")
        public void testKt16581_2() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt16581_2.kt", this::doTest);
        }

        @TestMetadata("kt16588.kt")
        public void testKt16588() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt16588.kt", this::doTest);
        }

        @TestMetadata("kt6301.kt")
        public void testKt6301() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt6301.kt", this::doTest);
        }

        @TestMetadata("kt6301_2.kt")
        public void testKt6301_2() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/kt6301_2.kt", this::doTest);
        }

        @TestMetadata("oneImplementation.kt")
        public void testOneImplementation() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/oneImplementation.kt", this::doTest);
        }

        @TestMetadata("oneImplementation2.kt")
        public void testOneImplementation2() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/oneImplementation2.kt", this::doTest);
        }

        @TestMetadata("simpleCall.kt")
        public void testSimpleCall() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/simpleCall.kt", this::doTest);
        }

        @TestMetadata("simpleProperty.kt")
        public void testSimpleProperty() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/simpleProperty.kt", this::doTest);
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Defaults extends AbstractBlackBoxCodegenTest {
            @TestMetadata("accessor.kt")
            public void testAccessor() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/accessor.kt", this::doTest);
            }

            @TestMetadata("accessorFromCompanion.kt")
            public void testAccessorFromCompanion() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/accessorFromCompanion.kt", this::doTest);
            }

            @TestMetadata("accessorsFromDefaultImpls.kt")
            public void testAccessorsFromDefaultImpls() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/accessorsFromDefaultImpls.kt", this::doTest);
            }

            public void testAllFilesPresentInDefaults() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("bridgeInClass.kt")
            public void testBridgeInClass() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInClass.kt", this::doTest);
            }

            @TestMetadata("bridgeInInterface.kt")
            public void testBridgeInInterface() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterface.kt", this::doTest);
            }

            @TestMetadata("bridgeInInterface2.kt")
            public void testBridgeInInterface2() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterface2.kt", this::doTest);
            }

            @TestMetadata("bridgeInInterfaceWithProperties.kt")
            public void testBridgeInInterfaceWithProperties() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterfaceWithProperties.kt", this::doTest);
            }

            @TestMetadata("bridgeInInterfaceWithProperties2.kt")
            public void testBridgeInInterfaceWithProperties2() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterfaceWithProperties2.kt", this::doTest);
            }

            @TestMetadata("bridgeWithJava.kt")
            public void testBridgeWithJava() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeWithJava.kt", this::doTest);
            }

            @TestMetadata("callableReference.kt")
            public void testCallableReference() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/callableReference.kt", this::doTest);
            }

            @TestMetadata("capturedSuperCall.kt")
            public void testCapturedSuperCall() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/capturedSuperCall.kt", this::doTest);
            }

            @TestMetadata("defaultArgs.kt")
            public void testDefaultArgs() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/defaultArgs.kt", this::doTest);
            }

            @TestMetadata("diamond.kt")
            public void testDiamond() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/diamond.kt", this::doTest);
            }

            @TestMetadata("inline.kt")
            public void testInline() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/inline.kt", this::doTest);
            }

            @TestMetadata("inlineProperty.kt")
            public void testInlineProperty() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/inlineProperty.kt", this::doTest);
            }

            @TestMetadata("kt11969.kt")
            public void testKt11969() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt11969.kt", this::doTest);
            }

            @TestMetadata("kt14243.kt")
            public void testKt14243() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243.kt", this::doTest);
            }

            @TestMetadata("kt14243_2.kt")
            public void testKt14243_2() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243_2.kt", this::doTest);
            }

            @TestMetadata("kt14243_prop.kt")
            public void testKt14243_prop() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243_prop.kt", this::doTest);
            }

            @TestMetadata("oneImplementation.kt")
            public void testOneImplementation() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/oneImplementation.kt", this::doTest);
            }

            @TestMetadata("oneImplementation2.kt")
            public void testOneImplementation2() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/oneImplementation2.kt", this::doTest);
            }

            @TestMetadata("privateDefaultFromDefaultImpl.kt")
            public void testPrivateDefaultFromDefaultImpl() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/privateDefaultFromDefaultImpl.kt", this::doTest);
            }

            @TestMetadata("privateInDefaultImpls.kt")
            public void testPrivateInDefaultImpls() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/privateInDefaultImpls.kt", this::doTest);
            }

            @TestMetadata("simpleCall.kt")
            public void testSimpleCall() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/simpleCall.kt", this::doTest);
            }

            @TestMetadata("simpleProperty.kt")
            public void testSimpleProperty() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/simpleProperty.kt", this::doTest);
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/superCall.kt", this::doTest);
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class DelegationBy extends AbstractBlackBoxCodegenTest {
                public void testAllFilesPresentInDelegationBy() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("simple.kt")
                public void testSimple() throws Exception {
                    KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy/simple.kt", this::doTest);
                }

                @TestMetadata("simpleProperty.kt")
                public void testSimpleProperty() throws Exception {
                    KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy/simpleProperty.kt", this::doTest);
                }
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class NoDelegation extends AbstractBlackBoxCodegenTest {
                public void testAllFilesPresentInNoDelegation() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("noDelegationToDefaultMethodInClass.kt")
                public void testNoDelegationToDefaultMethodInClass() throws Exception {
                    KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInClass.kt", this::doTest);
                }

                @TestMetadata("noDelegationToDefaultMethodInInterface.kt")
                public void testNoDelegationToDefaultMethodInInterface() throws Exception {
                    KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInInterface.kt", this::doTest);
                }

                @TestMetadata("noDelegationToDefaultMethodInInterface2.kt")
                public void testNoDelegationToDefaultMethodInInterface2() throws Exception {
                    KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInInterface2.kt", this::doTest);
                }
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/reflection")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Reflection extends AbstractBlackBoxCodegenTest {
                public void testAllFilesPresentInReflection() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("propertyAnnotations.kt")
                public void testPropertyAnnotations() throws Exception {
                    KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/defaults/reflection/propertyAnnotations.kt", this::doTest);
                }
            }
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/interfaceFlag")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InterfaceFlag extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInInterfaceFlag() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/interfaceFlag"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/interfaceFlag/superCall.kt", this::doTest);
            }

            @TestMetadata("superCallIndirect.kt")
            public void testSuperCallIndirect() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/interfaceFlag/superCallIndirect.kt", this::doTest);
            }
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/optimizations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Optimizations extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInOptimizations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/optimizations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("hashCode.kt")
            public void testHashCode() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/jvm8/optimizations/hashCode.kt", this::doTest);
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/mapGetOrDefault")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MapGetOrDefault extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInMapGetOrDefault() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/mapGetOrDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noTypeSafeBridge.kt")
        public void testNoTypeSafeBridge() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapGetOrDefault/noTypeSafeBridge.kt", this::doTest);
        }

        @TestMetadata("typeSafeBridge.kt")
        public void testTypeSafeBridge() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapGetOrDefault/typeSafeBridge.kt", this::doTest);
        }

        @TestMetadata("typeSafeBridgeNotNullAny.kt")
        public void testTypeSafeBridgeNotNullAny() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapGetOrDefault/typeSafeBridgeNotNullAny.kt", this::doTest);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/mapRemove")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MapRemove extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInMapRemove() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/mapRemove"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noDefaultImpls.kt")
        public void testNoDefaultImpls() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapRemove/noDefaultImpls.kt", this::doTest);
        }

        @TestMetadata("readOnlyMap.kt")
        public void testReadOnlyMap() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapRemove/readOnlyMap.kt", this::doTest);
        }

        @TestMetadata("typeSafeBridge.kt")
        public void testTypeSafeBridge() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapRemove/typeSafeBridge.kt", this::doTest);
        }

        @TestMetadata("typeSafeBridgeNotNullAny.kt")
        public void testTypeSafeBridgeNotNullAny() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/mapRemove/typeSafeBridgeNotNullAny.kt", this::doTest);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/parametersMetadata")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParametersMetadata extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInParametersMetadata() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/parametersMetadata"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultImpls.kt")
        public void testDefaultImpls() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/parametersMetadata/defaultImpls.kt", this::doTest);
        }

        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/parametersMetadata/enum.kt", this::doTest);
        }

        @TestMetadata("extensionFunction.kt")
        public void testExtensionFunction() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/parametersMetadata/extensionFunction.kt", this::doTest);
        }

        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/parametersMetadata/function.kt", this::doTest);
        }

        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/parametersMetadata/innerClass.kt", this::doTest);
        }

        @TestMetadata("superParams.kt")
        public void testSuperParams() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/parametersMetadata/superParams.kt", this::doTest);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/reflection")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Reflection extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInReflection() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("realParameterNames.kt")
        public void testRealParameterNames() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/reflection/realParameterNames.kt", this::doTest);
        }

        @TestMetadata("synthesizedParameterNames.kt")
        public void testSynthesizedParameterNames() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/reflection/synthesizedParameterNames.kt", this::doTest);
        }

        @TestMetadata("compiler/testData/codegen/java8/box/reflection/parameters")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Parameters extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInParameters() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/reflection/parameters"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("javaParametersHaveDefaultNames.kt")
            public void testJavaParametersHaveDefaultNames() throws Exception {
                KotlinTestUtils.runTest("compiler/testData/codegen/java8/box/reflection/parameters/javaParametersHaveDefaultNames.kt", this::doTest);
            }
        }
    }
}
