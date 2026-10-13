# 07-java-syntax-errors
Dependencies are valid and resolve fine. `Greeter.java` has 3 intentional syntax errors:
missing semicolon, unbalanced parenthesis, missing closing braces.
Expected: import + dependency resolution pass; the BUILD/compile stage fails with javac errors
pointing at Greeter.java. Good target for the "request a code modification" test (ask to fix the errors).
