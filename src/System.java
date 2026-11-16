package CS193.src;

import java.util.ArrayList;

public class System {

        private ArrayList<Course> listCourses = new ArrayList<>();
        private ArrayList<TrackConcentration> listTrack = new ArrayList<TrackConcentration>();

        // Set up and manage terminal activities
        void main() {
                // _____________________________ Set Up Course_______________________________//
                /**
                 * Course #0
                 */
                listCourses.add(new Course("CS180", "Problem Solving And Object-Oriented Programming", 4, null));
                /**
                 * Course #1
                 */
                listCourses.add(new Course("CS182", "Foundations of Computer Science", 3,
                                new Course[] { listCourses.get(0) }));
                /**
                 * Course #2
                 */
                listCourses.add(new Course("CS193", "Tools", 1, null));
                /**
                 * Course #3
                 */
                listCourses.add(new Course("CS240", "Programming in C", 3,
                                new Course[] { listCourses.get(0) }));
                /**
                 * Course #4
                 */
                listCourses.add(new Course("CS250", "Computer Architecture", 4,
                                new Course[] { listCourses.get(1), listCourses.get(3) }));
                /**
                 * Course #5
                 */
                listCourses.add(new Course("CS251", "Data Structures and Algorithm", 3,
                                new Course[] { listCourses.get(1), listCourses.get(3) }));
                /**
                 * Course #6
                 */
                listCourses.add(new Course("CS252", "System Programming", 4,
                                new Course[] { listCourses.get(4), listCourses.get(5) }));
                /**
                 * Course #7
                 */
                listCourses.add(new Course("CS243", "Artificial Intelligence Basics", 3,
                                new Course[] { listCourses.get(0), listCourses.get(1) }));
                /**
                 * Course #8
                 */
                listCourses.add(new Course("CS38003", "Python Programming", 1,
                                new Course[] { listCourses.get(0) }));
                /**
                 * Course #9
                 */
                listCourses.add(new Course("CS253", "Data Structures and Algorithm for DS/AI", 3,
                                new Course[] { listCourses.get(0), listCourses.get(1), listCourses.get(8) }));
                /**
                 * Course #10
                 */
                listCourses.add(new Course("CS307", "Software Engineering I", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #11
                 */
                listCourses.add(new Course("CS381", "Introduction To The Analysis Of Algorithms", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #12
                 */
                listCourses.add(new Course("CS348", "Information Systems", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #13
                 */
                listCourses.add(new Course("CS351", "Cloud Computing", 3,
                                new Course[] { listCourses.get(6) }));
                /**
                 * Course #14
                 */
                listCourses.add(new Course("CS352", "Compilers: Principles And Practice", 3,
                                new Course[] { listCourses.get(6) }));
                /**
                 * Course #15
                 */
                listCourses.add(new Course("CS353", "Principles Of Concurrency And Parallelism", 3,
                                new Course[] { listCourses.get(14) }));
                /**
                 * Course #16
                 */
                listCourses.add(new Course("CS354", "Operating Systems", 3,
                                new Course[] { listCourses.get(6) }));
                /**
                 * Course #17
                 */
                listCourses.add(new Course("CS355", "Introduction To Cryptography", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #18
                 */
                listCourses.add(new Course("CS373", "Data Mining And Machine Learning", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #19
                 */
                listCourses.add(new Course("CS38001", "C++ Programming", 3,
                                new Course[] { listCourses.get(3) }));
                /**
                 * Course #20
                 */
                listCourses.add(new Course("CS38002", "Advanced Java Programming", 3,
                                new Course[] { listCourses.get(0) }));
                /**
                 * Course #21
                 */
                listCourses.add(new Course("CS211", "Competitive Programming I", 2,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #22
                 */
                listCourses.add(new Course("CS311", "Competitive Programming II", 2,
                                new Course[] { listCourses.get(21) }));
                /**
                 * Course #23
                 */
                listCourses.add(new Course("CS411", "Competitive Programming III", 2,
                                new Course[] { listCourses.get(22) }));
                /**
                 * Course #24
                 */
                listCourses.add(new Course("CS407", "Software Engineering Senior Project", 3,
                                new Course[] { listCourses.get(10) }));
                /**
                 * Course #25
                 */
                listCourses.add(new Course("CS408", "Software Testing", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #26
                 */
                listCourses.add(new Course("CS422", "Computer Networks", 3,
                                new Course[] { listCourses.get(16) }));
                /**
                 * Course #27
                 */
                listCourses.add(new Course("CS426", "Computer Security", 3,
                                new Course[] { listCourses.get(16) }));
                /**
                 * Course #28
                 */
                listCourses.add(new Course("CS334", "Fundamentals of Computer Graphics", 3,
                                new Course[] { listCourses.get(3) }));
                /**
                 * Course #29
                 */
                listCourses.add(new Course("CS439", "Introduction To Data Visualization", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #30
                 */
                listCourses.add(new Course("CS440-NF", "Large Scale Data Analytics", 3,
                                new Course[] { listCourses.get(18) }));
                /**
                 * Course #31
                 */
                listCourses.add(new Course("CS441", "Data Science Capstone", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #32
                 */
                listCourses.add(new Course("CS448", "Introduction To Relational Database Systems", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #33
                 */
                listCourses.add(new Course("CS456", "Programming Languages", 3,
                                new Course[] { listCourses.get(14) }));
                /**
                 * Course #34
                 */
                listCourses.add(new Course("CS458", "Introduction To Robotics", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #35
                 */
                listCourses.add(new Course("CS471", "Introduction To Artificial Intelligence", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #36
                 */
                listCourses.add(new Course("CS473", "Web Information Search And Management", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #37
                 */
                listCourses.add(new Course("CS475", "Human-Computer Interaction", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #38
                 */
                listCourses.add(new Course("CS476", "Artificial Intelligence Capstone", 3,
                                new Course[] { listCourses.get(5) }));
                /**
                 * Course #39
                 */
                listCourses.add(new Course("CS477", "Natural Language Processing", 3,
                                new Course[] { listCourses.get(5), listCourses.get(18) }));
                /**
                 * Course #40
                 */
                listCourses.add(new Course("CS478", "Introduction To Bioinformatics", 3,
                                new Course[] { listCourses.get(0) }));
                /**
                 * Course #41
                 */
                listCourses.add(new Course("CS483", "Introduction To The Theory Of Computation", 3,
                                new Course[] { listCourses.get(11) }));
                /**
                 * Course #42
                 */
                listCourses.add(new Course("CS489", "Embedded Systems", 3,
                                new Course[] { listCourses.get(6) }));
                /**
                 * Course #43
                 */
                listCourses.add(new Course("CS434", "Advanced Computer Graphics", 3,
                                new Course[] { listCourses.get(28) }));
                /**
                 * Course #44
                 */
                listCourses.add(new Course("CS314", "Numerical Methods", 3,
                                new Course[] { listCourses.get(0) }));
                /**
                 * Course #45
                 */
                listCourses.add(new Course("CS361", "Great Issues In Computer Science", 3, null));
                /**
                 * Course #46
                 */
                listCourses.add(new Course("STAT350", "Introduction to Statistics", 3, null));
                /**
                 * Course #47
                 */
                listCourses.add(new Course("STAT511", "Statistical Methods", 3, null));
                /**
                 * Course #48
                 */
                listCourses.add(new Course("STAT512", "Applied Regression Analysis", 3,
                                new Course[] { listCourses.get(47) }));
                /**
                 * Course #49
                 */
                listCourses.add(new Course("MA165", "Analytic Geometry And Calculus I", 4, null));
                /**
                 * Course #50
                 */
                listCourses.add(new Course("MA166", "Analytic Geometry And Calculus II", 4,
                                new Course[] { listCourses.get(49) }));
                /**
                 * Course #51
                 */
                listCourses.add(new Course("MA261", "Multivariable Calculus", 3,
                                new Course[] { listCourses.get(50) }));
                /**
                 * Course #52
                 */
                listCourses.add(new Course("MA262", "Linear Algebra And Differential Equations", 4,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #53
                 */
                listCourses.add(new Course("MA265", "Linear Algebra", 3,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #54
                 */
                listCourses.add(new Course("MA351", "Elementary Linear Algebra", 3,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #55
                 */
                listCourses.add(new Course("MA266", "Ordinary Differential Equations", 3,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #56
                 */
                listCourses.add(new Course("STAT416", "Probability", 3,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #57
                 */
                listCourses.add(new Course("STAT417", "Statistical Theory", 3,
                                new Course[] { listCourses.get(56) }));
                /**
                 * Course #58
                 */
                listCourses.add(new Course("CS440", "Large Scale Data Analytics", 3,
                                new Course[] { listCourses.get(18), listCourses.get(57) }));
                /**
                 * Course #59
                 */
                listCourses.add(new Course("MA385", "Introduction to Logic", 3,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #60
                 */
                listCourses.add(new Course("MA453", "Elements of Algebra I", 3,
                                new Course[] { listCourses.get(53) }));
                /**
                 * Course #61
                 */
                listCourses.add(new Course("CS577", "Natural Language Processing", 3,
                                new Course[] { listCourses.get(5), listCourses.get(51), listCourses.get(18) }));
                /**
                 * Course #62
                 */
                listCourses.add(new Course("CS578", "Statistical Machine Learning", 3, null));
                /**
                 * Course #63
                 */
                listCourses.add(new Course("MA421", "Linear Programming And Optimization Techniques", 3,
                                new Course[] { listCourses.get(53) }));
                /**
                 * Course #64
                 */
                listCourses.add(new Course("MA362", "Topics In Vector Calculus", 3,
                                new Course[] { listCourses.get(51), listCourses.get(53) }));
                /**
                 * Course #65
                 */
                listCourses.add(new Course("MA366", "Ordinary Differential Equations", 4,
                                new Course[] { listCourses.get(53) }));
                /**
                 * Course #66
                 */
                listCourses.add(new Course("MA341", "Foundations Of Analysis", 3,
                                new Course[] { listCourses.get(51) }));
                /**
                 * Course #67
                 */
                listCourses.add(new Course("MA35301", "Linear Algebra II", 3,
                                new Course[] { listCourses.get(53) }));
                /**
                 * Course #68
                 */
                listCourses.add(new Course("MA440", "Honors Real Analysis I", 3,
                                new Course[] { listCourses.get(67) }));
                /**
                 * Course #69
                 */
                listCourses.add(new Course("CS510", "Software Engineering", 3, null));
                /**
                 * Course #70
                 */
                listCourses.add(new Course("CS514", "Numerical Analysis", 3,
                                new Course[] { listCourses.get(44) }));
                /**
                 * Course #71
                 */
                listCourses.add(new Course("CS515", "Numerical Linear Algebra", 3, null));
                /**
                 * Course #72
                 */
                listCourses.add(new Course("CS520", "Computational Methods In Optimization", 3,
                                new Course[] { listCourses.get(71) }));
                /**
                 * Course #73
                 */
                listCourses.add(new Course("CS525", "Parallel Computing", 3, null));
                /**
                 * Course #74
                 */
                listCourses.add(new Course("CS560", "Reasoning About Programs", 3,
                                new Course[] { listCourses.get(1), listCourses.get(5) }));
                /**
                 * Course #75
                 */
                listCourses.add(new Course("CS539", "Extended Reality: Principles And Applications", 3, null));
                /**
                 * Course #76
                 */
                listCourses.add(new Course("ECE301", "Signals And Systems", 3, null));
                /**
                 * Course #77
                 */
                listCourses.add(new Course("IE336", "Operations Research - Stochastic Models", 3, null));
                /**
                 * Course #78
                 */
                listCourses.add(new Course("IE335", "Operations Research - Optimization", 3, null));

                listCourses.get(11).setPrerequisite(new Course[] { listCourses.get(5), listCourses.get(51) });
                listCourses.get(44).setPrerequisite(new Course[] { listCourses.get(0), listCourses.get(53) });
                listCourses.get(28).setPrerequisite(new Course[] { listCourses.get(3), listCourses.get(53) });
                listCourses.get(18).setPrerequisite(new Course[] { listCourses.get(5), listCourses.get(46) });

                // _____________________________ Set Up Track_______________________________//

                // CSE, CGV, SWS, SWE, Security, PL, MI, FCS has the same structure
                // DBIS

                // Required: CS 314 && CS 381 && (MA 266 || MA 366) && (CS 373 || CS 473 || CS
                // 478 || ECE 301 || IE 336)
                // && (CS 352 || CS 353 || CS 354)
                // Selectives: CS 307, CS 422, CS 456, CS 458, CS 471, CS 483, CS 514, CS 515,
                // CS 520, CS 525, IE 335
                listTrack.add(new TrackConcentration("CSE", "Computational Science and Engineering",
                                new Object[] { listCourses.get(44), listCourses.get(11),
                                                new Object[] { listCourses.get(55), listCourses.get(65), "or" },
                                                new Object[] { listCourses.get(18), listCourses.get(36),
                                                                listCourses.get(40),
                                                                listCourses.get(76), listCourses.get(77), "or" },
                                                new Object[] { listCourses.get(14), listCourses.get(15),
                                                                listCourses.get(16), "or" }
                                },
                                new Object[] { listCourses.get(10), listCourses.get(26), listCourses.get(33),
                                                listCourses.get(34), listCourses.get(35), listCourses.get(41),
                                                listCourses.get(70), listCourses.get(71), listCourses.get(72),
                                                listCourses.get(73), listCourses.get(78)
                                }));

                // Required: (CS 314 || STAT 416) && ( CS 334 || CS 439 || CS 458 || CS 475) &&
                // (CS 373 || CS 471)
                // Selectives: CS334, CS 352, CS 354, CS 373, CS 381, CS 422, CS 434, CS 439, CS
                // 456, CS 458, CS 471, CS 475, MA 341, MA 440
                listTrack.add(new TrackConcentration("CGV", "Visual Computing",
                                new Object[] { new Object[] { listCourses.get(44), listCourses.get(56), "or" },
                                                new Object[] { listCourses.get(28), listCourses.get(29),
                                                                listCourses.get(34), listCourses.get(37), "or" },
                                                new Object[] { listCourses.get(18), listCourses.get(35), "or" }
                                },
                                new Object[] { listCourses.get(28), listCourses.get(14), listCourses.get(16),
                                                listCourses.get(18), listCourses.get(11), listCourses.get(26),
                                                listCourses.get(43), listCourses.get(29), listCourses.get(33),
                                                listCourses.get(34), listCourses.get(35), listCourses.get(37)
                                }));

                // Required: CS 348 && CS 381 && CS 448 $$ (CS 373 || CS 473)
                // Selectives: (CS 352 || CS 353 || CS 354) && (CS 355 || CS 426) && (CS 373 ||
                // CS 422 || CS 471 || CS 473 || CS 478 || CS 483)
                listTrack.add(new TrackConcentration("DBIS", "Database and Information Systems Track",
                                new Object[] { listCourses.get(12), listCourses.get(11), listCourses.get(42),
                                                new Object[] { listCourses.get(18), listCourses.get(36), "or" }
                                },
                                new Object[] {
                                                new Object[] { "Computing System", listCourses.get(14),
                                                                listCourses.get(15), listCourses.get(16) },
                                                new Object[] { "Information Assurance", listCourses.get(17),
                                                                listCourses.get(27) },
                                                new Object[] { "Related Studies", listCourses.get(18),
                                                                listCourses.get(26), listCourses.get(35),
                                                                listCourses.get(36), listCourses.get(40),
                                                                listCourses.get(41)
                                                }
                                }));

                // Required: CS 381 && (CS 352 || CS 354) && (CS 373 || CS 471)
                // Option: (CS 311 && CS 411), CS 314, CS 334, CS 353, CS 355, CS 448, CS 456,
                // CS 458, CS 483,
                // (MA 341 || MA 35301 || MA 362 || MA 366 || MA 385 || MA 421 || MA 453)
                listTrack.add(new TrackConcentration("FCS", "Algorithmic Foundations",
                                new Object[] { listCourses.get(11),
                                                new Object[] { listCourses.get(14), listCourses.get(16), "or" },
                                                new Object[] { listCourses.get(18), listCourses.get(35), "or" }
                                },
                                new Object[] { new Object[] { listCourses.get(22), listCourses.get(23), "and" },
                                                listCourses.get(44), listCourses.get(28), listCourses.get(15),
                                                listCourses.get(17), listCourses.get(32), listCourses.get(33),
                                                listCourses.get(34), listCourses.get(41),
                                                new Object[] { listCourses.get(66), listCourses.get(67),
                                                                listCourses.get(64),
                                                                listCourses.get(65), listCourses.get(59),
                                                                listCourses.get(63),
                                                                listCourses.get(60), "or" }
                                }));

                // Required: CS 373 && CS 381 && (CS 471 || CS 473) && (STAT 416 || STAT 512)
                // Selectives: (CS 311 && CS 411), CS 314, CS 348, CS 352, CS 448, CS 456, CS
                // 458, CS 471, CS 473, CS 483, (CS 439 || CS 440 || CS 475), (CS 477 || CS
                // 577), CS 578
                listTrack.add(new TrackConcentration("MI", "Machine Intelligence",
                                new Object[] { listCourses.get(18), listCourses.get(11),
                                                new Object[] { listCourses.get(35), listCourses.get(36), "or" },
                                                new Object[] { listCourses.get(56), listCourses.get(48), "or" }
                                },
                                new Object[] { new Object[] { listCourses.get(22), listCourses.get(23), "and" },
                                                listCourses.get(44), listCourses.get(12), listCourses.get(14),
                                                listCourses.get(32), listCourses.get(33), listCourses.get(34),
                                                listCourses.get(35), listCourses.get(36), listCourses.get(41),
                                                new Object[] { listCourses.get(29), listCourses.get(58),
                                                                listCourses.get(37), "or" },
                                                new Object[] { listCourses.get(39), listCourses.get(61), "or" },
                                                listCourses.get(62)
                                }));

                // Required: CS 352 && CS 354 && CS 456
                // Selectives: (CS 307 || CS 408), (CS 348 || CS 448), CS 353, CS 381, CS 426,
                // CS 483, CS 560, (MA 385 || MA 453)
                listTrack.add(new TrackConcentration("PL", "Programming Language",
                                new Object[] { listCourses.get(14), listCourses.get(16), listCourses.get(33) },
                                new Object[] { new Object[] { listCourses.get(10), listCourses.get(25), "or" },
                                                new Object[] { listCourses.get(12), listCourses.get(32), "or" },
                                                listCourses.get(15), listCourses.get(11), listCourses.get(27),
                                                listCourses.get(41), listCourses.get(74),
                                                new Object[] { listCourses.get(59), listCourses.get(60), "or" }
                                }));

                // Required: CS 354 && CS 355 && CS 426
                // Selectives: (CS 307 || CS 408), (CS 348 || CS 448 || CS 473), CS 352, (CS 353
                // || CS 456), (CS 373 || CS 471), CS 381, CS 422, CS 489
                listTrack.add(new TrackConcentration("Security", "Security",
                                new Object[] { listCourses.get(16), listCourses.get(17), listCourses.get(27) },
                                new Object[] { new Object[] { listCourses.get(10), listCourses.get(25), "or" },
                                                new Object[] { listCourses.get(12), listCourses.get(32),
                                                                listCourses.get(36), "or" },
                                                listCourses.get(14),
                                                new Object[] { listCourses.get(15), listCourses.get(33), "or" },
                                                new Object[] { listCourses.get(18), listCourses.get(35), "or" },
                                                listCourses.get(11), listCourses.get(26), listCourses.get(42)
                                }));

                // Required: CS 307 && (CS 352 || CS 354) && CS 381 && CS 408 && CS 407
                // Selectives: (CS 311 && CS 411), CS 348, CS 351, CS 352, CS 353, CS 354, CS
                // 373, CS 422, CS 426, CS 448, CS 456, CS 473, CS 489, CS 510
                listTrack.add(new TrackConcentration("SWE", "Software Engineering",
                                new Object[] { listCourses.get(10),
                                                new Object[] { listCourses.get(14), listCourses.get(16), "or" },
                                                listCourses.get(11), listCourses.get(25), listCourses.get(24)
                                },
                                new Object[] { new Object[] { listCourses.get(22), listCourses.get(23), "and" },
                                                listCourses.get(12), listCourses.get(13), listCourses.get(14),
                                                listCourses.get(15), listCourses.get(16), listCourses.get(18),
                                                listCourses.get(26), listCourses.get(27), listCourses.get(32),
                                                listCourses.get(33), listCourses.get(36), listCourses.get(42),
                                                listCourses.get(69)
                                }));

                // Required: CS 352 && CS 354 && CS 422
                // Selectives: CS 307, (CS 311 && CS 411), CS 334, CS 351, CS 353, CS 381, CS
                // 426, CS 448, CS 456, CS 489, CS 539
                listTrack.add(new TrackConcentration("SSW", "Systems Software",
                                new Object[] { listCourses.get(14), listCourses.get(16), listCourses.get(26)
                                },
                                new Object[] { listCourses.get(10),
                                                new Object[] { listCourses.get(22), listCourses.get(23), "and" },
                                                listCourses.get(28), listCourses.get(13), listCourses.get(15),
                                                listCourses.get(11), listCourses.get(27), listCourses.get(32),
                                                listCourses.get(33), listCourses.get(42), listCourses.get(75)
                                }));

                // _____________________________ Information _______________________________//

                IO.println(
                                "⋆.˚ ─────────୨ৎ──────── ⋆.˚Welcome to the Purdue University Computer Science⋆.˚ ─────────୨ৎ──────── ⋆.˚");
                IO.println("What do you want to find information about?\n"
                                + "To find information about courses, type in 1\n"
                                + "To find information about different CS tracks, type in 2\n"
                                + "To view the courses in a map, type in 3\n"
                                + "To find the courses you need to take, type in 4\n"
                                + "To exit, type in \"Exit\"\n");
                String request = IO.readln("What do you want to find information about? ");
                IO.println("\n");

                while (!request.equals("Exit")) {
                        if (request.equals("1")) {
                                IO.println("To find information about Purdue CS courses, type in below the course code. The course code should be in the form CS###\n"
                                                + "if the course has two ending 0s, and CS##### if the course does not have two ending 0s\n"
                                                + "To find information about Purdue Statisitcs courses that CS applied, the course code should be in the form STAT###.\n"
                                                + "To find information about Purdue Math courses that CS applied, the course code should be in the form MA###.\n"
                                                + "if the course has two ending 0s, and MA##### if the course does not have two ending 0s\n"
                                                + "To find information about Purdue Industrial Engineering courses that CS applied, the course code should be in the form IE###.\n"
                                                + "To find information about Purdue Electrical and Computer Engineering courses that CS applied, the course code should be in the form ECE###.\n"
                                                + "For each course, the prerequisite course need to have a grade of at least C to be registable\n"
                                                + "Not all courses is available, and not all courses shows the full prerequisite list, since this is a Purdue CS course page.\n"
                                                + "Concurrent prerequisite should be checked by yourself, this model does not account for it yet.\n"
                                                + "To exit this mode, type in \"Exit mode\"");

                                String input = IO.readln("What course do you want to find information about today? ");
                                IO.println("\n");

                                while (!input.equals("Exit mode")) {
                                        IO.println(getInformationCourse(input));
                                        IO.println("\n");
                                        input = IO.readln("What course do you want to find information about today? ");
                                        IO.println("\n");
                                }

                        } else if (request.equals("2")) {
                                IO.println("To find information about Purdue CS tracks, type in below the course code. The course code should be one of the following\n"
                                                + "SWE, SSW, Security, MI, PL, DBIS, CSE, CGV, FCS\n"
                                                + "To exit this mode, type in \"Exit mode\"");

                                String input = IO.readln("What track do you want to find information about today? ");
                                IO.println("\n");

                                while (!input.equals("Exit mode")) {
                                        IO.println(getInformationTrack(input));
                                        IO.println("\n");
                                        input = IO.readln("What track do you want to find information about today? ");
                                        IO.println("\n");
                                }

                        } else if (request.equals("3")) {

                        } else if (request.equals("4")) {

                        }

                        IO.println("What do you want to find information about?\n"
                                        + "To find information about courses, type in 1\n"
                                        + "To find information about different CS tracks, type in 2\n"
                                        + "To check the eligibity of your list of courses, type in 3\n"
                                        + "To view the tracks in a map, type in 4\n"
                                        + "To exit, type in \"Exit\"\n");
                        request = IO.readln("What do you want to find information about? ");
                        IO.println("\n");
                }

                IO.println("Thank you, looking forward to assisting you soon");
        }

        // This method return the information about the course after taking the input
        public String getInformationCourse(String courseCode) {

                int coursePosition = -1;

                for (int i = 0; i < listCourses.size(); i++) {
                        if (listCourses.get(i).getCourseCode().equals(courseCode)) {
                                coursePosition = i;
                                break;
                        }
                }

                if (coursePosition == -1) {
                        return ("Sorry, course " + courseCode + " does not exist. Please try another course.");
                } else {
                        return listCourses.get(coursePosition).toString();
                }
        }

        // This method return the information about the track after taking the input
        public String getInformationTrack(String trackCode) {

                int trackPosition = -1;

                for (int i = 0; i < listTrack.size(); i++) {
                        if (listTrack.get(i).getTrackCode().equals(trackCode)) {
                                trackPosition = i;
                                break;
                        }
                }

                if (trackPosition == -1) {
                        return ("Sorry, course " + trackCode + " does not exist. Please try another course.");
                } else {
                        return listTrack.get(trackPosition).toString();
                }
        }

        // This method find all the CS classes need to take. If none, return null.
        public String getAllCourse(String courseCode) {
                return null;
        }

        public String removeDuplicate(String listCourseCode) {
                String[] input = listCourseCode.split(",");
                ArrayList<String> read = new ArrayList<>();
                String output = "";
                for (int i = 0; i < input.length; i++) {
                        if (read.contains(input[i])) {
                                continue;
                        } else {
                                read.add(input[i]);
                                output += input[i] + ", ";
                        }
                }
                return output;
        }
}
