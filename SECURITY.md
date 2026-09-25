# Security Policy

## About This Repository

**ComputerProgramming1** is a collection of Java programs, laboratory exercises,
quizzes, and task performances created for a Computer Programming 1 course.
It is intended for **learning and reference purposes only** and is not a
production library or application.

Because of this, the repository does not have formal release versions.
Only the current state of the `main` branch is maintained.

## Supported Versions

| Branch / Version | Supported          |
| ---------------- | ------------------ |
| `main` (latest)  | :white_check_mark: |
| Older commits    | :x:                |

## Scope

The code here consists of small, standalone Java console programs that:

- Do **not** connect to networks, databases, or external services
- Do **not** store or process credentials or personal data
- Read input only from the keyboard (`Scanner`) or hard-coded values

As such, the attack surface is minimal. However, if you find something that
could be harmful — for example, code that unexpectedly reads/writes files,
executes system commands, or contains a malicious dependency or payload —
please report it.

## Reporting a Vulnerability

If you discover a security issue in this repository:

1. **Do not open a public issue** describing the problem in detail.
2. Instead, report it privately through one of the following:
   - GitHub's **"Report a vulnerability"** feature under the
     [Security tab](https://github.com/sanguirIS/ComputerProgramming1/security)
     of this repository (if enabled), or
   - Contacting the repository owner, [@sanguirIS](https://github.com/sanguirIS),
     directly via GitHub.
3. Include as much of the following as you can:
   - The file(s) or folder(s) affected (e.g. `03 Laboratory Exercise 1 - ARG/`)
   - A description of the issue and why it is a concern
   - Steps to reproduce, if applicable

### What to Expect

- You should receive an acknowledgement within **7 days**.
- Since this is a personal, educational project, fixes are made on a
  best-effort basis. Confirmed issues will be corrected on `main` as soon as
  reasonably possible.
- If a report is declined (for example, because it is out of scope for an
  educational repository), a short explanation will be provided.

## Safe Usage Guidelines

When running any code from this repository:

- Review the source before compiling and running it — this is good practice
  for any code downloaded from the internet.
- Compile and run using a supported Java JDK (8 or newer).
- Run the programs in a normal user account, not as an administrator/root.

## License

This project is distributed under the terms described in the
[license](license) file. Security reports are appreciated and will be credited
if the reporter wishes.
